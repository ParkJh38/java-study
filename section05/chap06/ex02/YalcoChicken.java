package section05.chap06.ex02;
// 상속(Inheritance)
// 기존 YalcoChicken 본사 클래스
public class YalcoChicken {

    protected int no;
    protected String name;  // protect는 자식 클래스에서도 사용 가능
    // private 로 바꾸면
    // 💡 상속이 안 되는 것은 아님 - 자식클래스의 코드에서 사용하지 못할 뿐

    public YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder () {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
