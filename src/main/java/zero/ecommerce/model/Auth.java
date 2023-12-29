package zero.ecommerce.model;


import lombok.Data;
import zero.ecommerce.persist.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.List;

public class Auth {

    @Data
    public static class SignIn {
        private String userEmail;
        private String password;

    }

    @Data
    public static class SignUp {
        private String userEmail;
        private String username;
        private String password;
        private String phoneNumber;
        private int gender; // 0: male, 1: female
        private List<String> role; // "seller" or "buyer"
        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;

        public UserEntity toEntity(){
            return UserEntity.builder()
                    .userEmail(this.userEmail)
                    .username(this.username)
                    .password(this.password)
                    .phoneNumber(this.phoneNumber)
                    .gender(this.gender)
                    .role(this.role)
                    .createdAt(this.createdAt)
                    .modifiedAt(this.modifiedAt)
                    .build();
        }

    }
}
