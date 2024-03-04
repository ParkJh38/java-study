package section06.chap04.ex02;

public class Button {

    String name;
    public Button(String name) {
        this.name = name;
    }

    //  ⭐️ 인터페이스를 상속한 클래스 자료형
    // private 멤버변수
    // -> OnClickListener 인터페이스를 구현한 클래스의 인스턴스를 나타냄
    private OnClickListener onClickListener;  // onClick 메소드 보유하는 인터페이스를 구현한 클래스의 인스턴스

    // setOnClickListener 메소드: setter로 외부에서 받아옴
    // 외부 클래스에서 onClickListener 인스턴스를 설정할 수 있도록 함
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // func 메소드는 onClickListener 인스턴스의 onClick 메소드를 호출
    public void func () {
        onClickListener.onClick();
    }
}