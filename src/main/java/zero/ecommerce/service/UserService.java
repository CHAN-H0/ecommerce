package zero.ecommerce.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import zero.ecommerce.persist.entity.UserEntity;
import zero.ecommerce.persist.UserRepository;
import zero.ecommerce.model.Auth;

@Slf4j
@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return this.userRepository.findByUserEmail(userEmail)
                .orElseThrow(() -> new UsernameNotFoundException("가입 되지 않은 이메일 입니다."));
    }

    public UserEntity register(Auth.SignUp user){
        boolean exists = this.userRepository.existsByUserEmail(user.getUserEmail());
        if (exists) {
            throw new RuntimeException("이미 사용 중인 이메일 입니다.");
        }
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        var result = this.userRepository.save(user.toEntity());
        return result;
    }

    public UserEntity authenticate(Auth.SignIn member) {
        // 이메일로 멤버 조회
        var user = this.userRepository.findByUserEmail(member.getUserEmail())
                .orElseThrow(() -> new RuntimeException("존재하지 않는 이메일 입니다"));
        // 패스워드 일치 여부 확인
        if(!this.passwordEncoder.matches(member.getPassword(), user.getPassword())){
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }
        return user;
    }
}
