# Kiosk
Lv1 . 기본적인 키오스크를 프로그래밍
Scanner 활용법, 조건문, 반복문을 적절히 활용해서 코드를 만들었음

Lv2객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
햄버거 메뉴를 MenuItem 클래스와 List를 통해 관리합니다
MenuItem을 통해서 개별 음식 항목을 관리하는 클래스입니다
(이름, 가격, 설명)
메인 클래스에서는 리스트를 선언해서 여러 메뉴 아이템을 추가해줍니다
List<MenuItem> menuItems = new ArrayList<>();
반복문을 활용해 menuItems를 탐색하면서 하나씩 접근합니다.

Lv 3. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기
main 함수에서 관리하던 전체 순서 제어를 Kiosk 클래스를 통해 관리
키오스크 클래스를 생성하고 키오스크 프로그램의 매뉴를 관리하고 사용자 입력을 처리하는 클래쓰
`MenuItem`을 관리하는 리스트가 필드로 존재합니다.
`main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.
`List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
`Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.

Lv 4. 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기
`Menu` 클래스 생성하기
설명 : MenuItem 클래스를 관리하는 클래스입니다. 
예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함합니다.
`List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.
여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 갖습니다.
메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 합니다.

Lv 5. 캡슐화 적용하기
`MenuItem`, `Menu` 그리고 `Kiosk` 클래스의 필드에 직접 접근하지 못하도록 설정합니다.
Getter와 Setter 메서드를 사용해 데이터를 관리합니다.