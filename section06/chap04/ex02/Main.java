package section06.chap04.ex02;
//
public class Main {
    public static void main(String[] args) {

        // Button 클래스의 세개의 인스턴스인 button1, 2, 3 생성
        Button button1 = new Button("Enter");
        Button button2 = new Button("CapsLock");
        Button button3 = new Button("ShutDown");

        // 익명클래스 1
        // { }안에 익명 클래스 내용 작성한 것
        // button1.setOnClickListener(...) 메소드 호출에 인자로 익명 클래스의 인스턴스를 전달
        // 이때 괄호 내부의 코드 블록이 익명 클래스의 내용을 정의하는 부분
        button1.setOnClickListener(new OnClickListener() {  //  ⭐️ IDE에서 회색으로 표시 : 이후 배울 람다로 대체
            @Override  // OnClickListener 인터페이스를 적용한 익명 클래스를 만들어서
            public void onClick() {
                System.out.println("줄바꿈");
                System.out.println("커서를 다음 줄에 위치");
            }
        });
        // button1.setOnClickListener(new OnClickListener() {익명클래스 내용});
        // 이렇게 button1 인스턴스의 setOnClickListener 메소드 호출하고
        // 인자로 익명클래스 인스턴스(new OnClickListener) 전달

        // 익명클래스 2
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("기본입력 대소문자 전환");
            }
        });

        // 익명클래스 3
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("작업 자동 저장");
                System.out.println("프로그램 종료");
            }
        });

        for (var button : new Button[] {button1, button2, button3}) {
            button.func();
        }
    }
}



