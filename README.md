# android-movie-ticket

## View 기능 명세
### 영화 목록
- [x] 툴바
  - [x] 제목 
- [x] 영화 리스트뷰
  - [x] 제목
  - [x] 상영일
  - [x] 러닝타임
  - [x] 포스터
  - [x] 지금 예매 버튼

### 영화 예매
- [x] 툴바
  - [x] 제목
  - [x] 뒤로 가기 버튼
- [x] 포스터
- [x] 제목
- [x] 상영일
- [x] 러닝타임
- [x] 줄거리
- [x] 예매완료 버튼
- [x] 예매 장수
- [x] 예매 장수 +, - 버튼


### 영화 예매 - 완료
- [x] 툴바
  - [x] 제목
  - [x] 뒤로 가기 버튼
- [x] 제목
- [x] 상영일
- [x] 가격
- [x] 예매 인원 수
- [x] 예매 취소 안내 문구

## 도메인 기능 명세

### 영화 목록 화면
- [x] 리스트 뷰는 영화 종류를 보여줌
- [x] 영화 목록에서 지금 예매 버튼을 누르면 영화 예매 화면으로 이동
  - [x] 이동 시 선택된 아이템에 해당하는 영화 정보 전달

### 영화 예매 화면
- [x] 영화 예매에서 예매 완료 버튼을 누르면 영화 예매 완료 화면으로 이동
  - [x] 이동 시 티켓 매수 및 영화 정보 전달
- [x] 마이너스 버튼을 누르면 1보다 작을 수 없음
- [x] 플러스 버튼을 누르면 100보다 클 수 없음
- [x] 뒤로 가기

### 영화 예매 완료 화면
- [x] 티켓 총 매수에 따른 금액 계산
- [x] 영화 예매 정보 받아서 보여줌
- [x] 뒤로 가기