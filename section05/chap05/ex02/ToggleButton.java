package section05.chap05.ex02;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        super(print);  // 부모의 생성자로 자기 자신 생성
        this.on = on;
    }

    // 부모의 기타 메소드를 자식 클래스에서 사용시에는
    // 앞에 super.를 붙임 (super.func( );)
    // this가 해당 클래스의 인스턴스를 가리키는 것처럼 super는 부모 클래스의 인스턴스를 가리킴
    @Override  // 어노테이션: 부모의 특정 메소드를 오버라이드함을 명시
    public void func () {
        super.func(); // 💡 부모에서 정의한 메소드 호출
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}
