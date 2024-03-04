package section05.chap05.ex02;
// 부모 클래스에 생성자가 작성되었으면 자식 클래스에도 생성자 반드시!!! 작성 필요
// 자식 클래스 생성자 작성시에는 반드시 super를 사용하여 부모의 생성자 먼저 호출
// 이후 추가로 필요한 내용 작성
// 즉, 자식 클래스의 생성자는 super로 먼저 시작되어야 됨
public class ShutDownButton extends Button {

    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출 (Button 생성자 호출)
    }

    //  💡 부모의 메소드를 override
    @Override  // 물려받을 메소드 이름을 잘못입력하는 것 방지 안전장치
    public void func () {
        System.out.println("프로그램 종료");
    }
}
