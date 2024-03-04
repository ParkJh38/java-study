package section06.chap06.ex01;
// enum ButtonMode, ButtonSpace를 Button 클래스 외부에 작성
public class Main {
    public static void main(String[] args) {

        Button button1 = new Button();

        // setter에도 지정할 수 있는 값이 정해져 있으므로 다른 잘못된 값을 넣는 오류 피할 수 있음
        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);

        //  ⚠️ 아래와 같은 오용이 방지됨
        // ButtonMode에 ButtonSpace 값이 들어가는 등의 오용 방지
//        button1.setButtonMode(ButtonSpace.DOUBLE);
    }
}
