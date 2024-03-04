package section05.chap06.ex02;

// 드라이브스루를 갖춘 얄코치킨의 클래스를 만들고 싶다면?
// 기존 얄코치킨 클래스의 모든 필드와 메소드 포함
// 드라이브스루 관련 필드와 메소드 추가
// YalcoChicken 클래스를 부모로 하는 자식 클래스 YalcoChickenDT
// extends 연산자 사용 (기입하지 않아도 기존 얄코치킨 클래스의 정보를 모두 가짐)
public class YalcoChickenDT extends YalcoChicken {

    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name); // 다음 예제에서 다룰 것
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder () {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}