package section06.chap06.ex02;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button();

        button1.setMode(Button.Mode.DARK);
        // Button.Mode.DARK 에서 볼 수 있듯이,
        // 열거형이 클래스 안에 소속된 것을 쉽게 확인 가능
        button1.setSpace(Button.Space.DOUBLE);
    }
}
