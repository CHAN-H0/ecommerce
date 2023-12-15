# 🗒 커머스 프로젝트  
  * 상품의 구매 및 판매 서비스
<br/><br/>
## 📑 프로젝트 기능 및 설계

- **상품검색 및 조회**
  * 상품검색은 로그인 여부와 관계없이 진행할 수 있다.
  * 상품조회 시 상품명, 가격, 판매수량, 상품설명, 판매자 이름, 상품후기 등 상품에 대한 정보를 확인할 수 있다.
<br/>
    
- **회원가입**
  * 회원가입 시 이메일, 이름, 생년월일, 비밀번호, 주소, 연락처, 성별 정보가 필요하다.
  * 회원가입 시 판매자, 구매자 권한을 선택한다.
  * 회원가입 시 중복된 이메일은 에러를 발생한다.
<br/>
    
- **로그인**
  * 로그인 시 가입되지 않은 이메일을 이용하여 로그인을 시도하면 에러를 발생한다.
  * 로그인 시 비밀번호가 일치 하지 않으면 에러를 발생한다.
  * 판매자 로그인 시 상품등록, 삭제가 가능하다.
  * 구매자 로그인 시 장바구니 기능을 사용할 수 있다.
  * 관리자 로그인 시 상품삭제, 회원 관리를 할 수 있다.
<br/>

- **상품관리**
  * 로그인 된 판매자는 상품을 등록할 수 있다.
  * 상품등록 시 상품명, 가격, 판매수량, 상품설명을 입력한다.
  * 로그인 된 판매자와 관리자는 등록된 상품을 삭제할 수 있다.
<br/>

- **장바구니 기능**
  * 로그인 된 구매자는 상품을 장바구니에 담을 수 있다.
  * 로그인 된 구매자는 본인의 장바구니를 조회할 수 있다.
  * 로그인 된 구매자는 본인의 장바구니의 수량을 변경할 수 있다.
  * 로그인 된 구매자는 본인의 장바구니 목록을 삭제할 수 있다.
<br/>
 
- **상품주문**
  * 상품주문을 하면 결제완료 상태가 된다.
  * 로그인 된 구매자는 결제완료 상태의 주문을 취소 할 수 있다.
<br/>
 
- **상품후기**
  * 로그인 된 구매자는 주문한 상품의 상품후기를 작성할 수 있다.
  * 로그인 된 구매자는 상품의 후기를 수정, 삭제할 수 있다.
  * 로그인 된 관리자는 상품의 후기를 삭제할 수 있다.
<br/><br/>

     
## 🔗 ERD
![image](https://github.com/CHAN-H0/ecommerce/assets/130299425/a24de9db-7f9a-400c-bfbc-b13e9dcafd40)
<br/>
## 💥 Trouble Shooting
[문제 해결](TROUBLE_SHOOTING.md)
<br/>

### 🛠️ Tech Stack
<div align=left> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>
