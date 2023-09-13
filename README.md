# 🏖 ohTravel (2022)
### 📌 프로젝트 주제
**: 여행 상품 쇼핑몰 웹 사이트**

    바쁜 일상 속, 어디론가 떠나고 싶은 날 . . .
    
    하지만 흩어져있는 여행 정보들을 
    일일이 찾아보는 것은 귀찮았다면 ?!
    
    여행, 어떤 것부터 정해야 할지 막막했다면?
    
    가고 싶은 장소만 검색해도 
    숙박, 항공, 패키지, 입장권을 한 사이트에서 찾아보고, 
    회원 특가로 간단하게 예매할 수 있도록 !

</br>

### 📍 목차
1. [제작 기간 · 참여 인원](#제작-기간--참여-인원)
2. [사용 기술](#사용-기술)
3. [ERD 설계](#erd-설계)
4. [구현 부분](#구현-부분)
5. [실제 화면](#실제-화면)

---

</br>

## 제작 기간 · 참여 인원
- 2022.11.15 ~ 2022.12.19
- 팀 프로젝트 (7명)

</br>

## 사용 기술
#### `Back-end`
- Language&nbsp;&nbsp;  | `JAVA 11`
- Framework | `Spring Boot 2.7.5`, `MyBatis`, `JPA`
- DB &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | `MySQL`

#### `Front-end`
- `HTML5`
- `CSS3`
- `JavaScript`
- `Thymeleaf`

#### `Tools`
- GitHub
- Notion
  
</br>

## ERD 설계
- 프로젝트 전체 ERD
  ![image](https://github.com/bono039/ohTravel/assets/67899934/d787506f-360d-46a0-a017-53b84b7d8c99)

</br>

- 입장권 관련 ERD
![image](https://github.com/bono039/ohTravel/assets/67899934/f44e4984-2ee5-4c91-9fc3-0c1193ba3b9c)

</br>

## 구현 부분
### **입장권 예약 관련 기능**
- **검색**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 여행지 / 입장권 이름으로 검색
- **입장권 상품 정렬하기** &nbsp;- 대표 이미지 / 찜 여부 / 상품권 이름 / 가격 / 별점 표기
- **입장권 상품 상세 보기** - 상품 타입 선택 : 사용일자 , 수량 옵션
- **입장권 상품 예약하기**&nbsp; - 기본 주문 정보 / 상품 정보 / 결제 방법 / 필수 약관 확인 후 결제

</br>

## 실제 화면
- [입장권] 메인화면
![image](https://github.com/bono039/ohTravel/assets/67899934/18a51db3-d5d1-4067-92a8-fcbd14399abc)

</br>

- [입장권] 상품 상세 페이지 화면

  ![image](https://github.com/bono039/ohTravel/assets/67899934/6c7bb73f-449c-4aff-b126-0ad9c9a55468)

</br>

- [입장권] 상품 예약 및 결제 화면
![image](https://github.com/bono039/ohTravel/assets/67899934/58691685-d64e-4332-9a06-2dd9f2f7cb9a)
![image](https://github.com/bono039/ohTravel/assets/67899934/25c1619e-ca15-4e09-aae0-8d67053e623d)

</br>

- [마이페이지] 입장권 상품 예약 내역 확인하기
![image](https://github.com/bono039/ohTravel/assets/67899934/149a617b-707e-40e8-8e4a-0bdb8b1bbf71)

</br>

