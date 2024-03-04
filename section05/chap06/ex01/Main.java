package section05.chap06.ex01;
// 다형성 (Polymorphism)
// ⭐️ 부모/자식 관계는 범주의 포함 관계로 이어짐
public class Main {
    public static void main(String[] args) {

        //  💡가능 - 자식 클래스는 부모 클래스의 한 종류로 인식됨
        // But, 부모 클래스를 자식 클래스의 자리에 넣을 수는 없음 (다른 포함 관계 방향은 불가)
        // button123 을 담는 변수에 부모 클래스의 Button 뿐만 아니라 자식 클래스의 ShutDownButton과 ToggleButton도 가능함
        // ""모든 셧다운버튼과 토글버튼은 버튼이다.""
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  ⚠️ 불가
//      ShutDownButton button4 = new Button("Enter");
//      ToggleButton button5 = new ShutDownButton();



        //⭐️ 이처럼 특정 자료형의 자리에 여러 종류가 들어올 수 있는 것 - 다형성
        // 상속, 오버라이딩, 이후 배울 인터페이스 등을 통해 구현 가능
        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button button : buttons) {
            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
            button.func();
        }

        //==============================================================
        // instanceof 연산자
        // 뒤에 오는 클래스의 자료형에 속하는(족보상 같거나 아래인) 인스턴스인지 확인
        // 상속관계가 아닌 클래스끼리는 컴파일 오류
        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false (포함관계가 반대로 잘못됨)
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;
    }
}
