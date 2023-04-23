# android-movie-ticket

# 기능 목록
- [x] 레이아웃을 만든다.
  - 메인, 상세 정보, 예매 완료 페이지
  - 리스트 아이템
- [x] 메인 페이지에 영화 리스트가 보인다.
- [x] 영화를 선택하면 (리스트 아이템, 버튼) 상세 정보 페이지로 이동한다.
- [x] 상세 정보 페이지에서 예약할 인원을 선택한다.
- [x] 상세 정보 페이지에서 예매 완료를 선택하면 예매 완료 페이지로 이동한다.
- [x] 예매 완료 페이지에서 인원과 가격을 보여준다.

- [x] 상영 날짜 `범위`를 갖는다.
- [x] 영화를 볼 날짜를 선택한다. (`스피너` 이용)
- [x] 영화를 볼 시간을 선택한다. (`스피너` 이용)
  - [x] 평일 시간의 범위는 오전 9시부터 자정까지 2시간 간격이다.
  - [x] 주말 시간의 범위는 오전 10시부터 자정까지 2시간 간격이다.
- [x] 할인 조건에 따라 다른 할인 정책이 적용된다.
  - [x] 무비데이: 10, 20, 30일 -> 10% 할인
  - [x] 조조/야간: 11시 이전, 20시 이후 -> 2000원 할인
  - 무비데이 할인이 선적용, 중복 할인 가능
- [x] 화면이 가로로 전환되어도 데이터가 유지된다.
- [x] 액션바 back 버튼을 누르면 뒤로가기가 된다.

- [x] 레이아웃을 만든다.
  - 좌석 선택 페이지
  - 좌석은 총 5행 4열로 구성되어 있고 각 행은 알파벳, 열은 숫자로 표현한다.
  - 1, 2행은 B등급, 보라색 글자로 표시한다. (10,000원)
  - 3, 4행은 S등급, 초록색 글자로 표시한다. (15,000원)
  - 5행은 A등급, 파란색 글자로 표시한다. (12,000원)
- [x] 사용자는 인원/날짜 선택 후에 좌석을 고를 수 있다.
- [x] 좌석을 선택하면 배경색이 바뀌고, 하단에 할인정책과 좌석 등급을 고려한 최종 가격이 표시된다.
  - [x] 선택된 좌석을 재선택하면 선택이 해제된다.
  - [x] 좌석을 모두 선택하면 더 이상 좌석 선택이 불가능하다.
    - [x] 추가 좌석 선택 불가 토스트가 보인다.
  - [x] 좌석을 모두 선택하면 확인 버튼의 배경색이 바뀌고 클릭이 가능하다.
  - [x] 좌석을 선택하면 최종 가격이 표시된다.
- [x] 최종 예매를 확인하는 다이얼로그가 표시되고 배경을 터치해도 사라지지 않아야 한다.
- [x] 화면이 가로로 전환되어도 데이터가 유지된다.
- [x] 예매 완료 페이지에서 선택한 좌석을 확인할 수 있다.

- [x] 영화 목록에 영화가 세 번 노출될 때마다 광고가 한 번 노출된다.
  - 영화 목록의 요소는 10,000개까지 추가될 수 있다.

- [x] 기능 요구 사항에 대한 UI 테스트를 작성해야 한다.
  