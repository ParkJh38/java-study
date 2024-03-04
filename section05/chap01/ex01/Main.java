package section05.chap01.ex01;
// Button 클래스에서 선언한 것이 다른 인스턴스의 자료형이 됨
public class Main {
    // 객체 object / 인스턴스 instance : 속성(프로퍼티)들과 기능(메소드)들의 묶음
    public static void main(String[] args) {
        // 인스턴스 제작 (속성: print, space, mode), (기능: place)
        Button button1 = new Button('1', 1, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonEqual = new Button('=', 2, "DARK");

        // 각각의 인스턴스에 대하여 place 기능 실행
        button1.place();
        buttonPlus.place();
        buttonEqual.place();
    }
}
