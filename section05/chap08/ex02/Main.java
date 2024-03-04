package section05.chap08.ex02;

public class Main {
    public static void main(String[] args) {

        // Button, Switch, DropDown 각각의 생성자대로 인스턴스 생성
        Button button1 = new Button(2, "Enter");
        Switch switch1 = new Switch(3, true);
        DropDown dropDown1 = new DropDown(5, new String[] {
                "이름 오름차순", "이름 내림차순",
                "크기 오름차순", "크기 내림차순",
                "날짜 오름차순", "날짜 내림차순"
        });

        //  💡 다형성 적용 확인
        clickFormElement(button1);

        clickFormElement(switch1);
        clickFormElement(switch1);
        clickFormElement(switch1);

        clickFormElement(dropDown1);

    }

    // 인자로 FormElement를 받음
    // FormElement로부터 상속받은 클래스의 인스턴스 받음
    public static void clickFormElement (FormElement fe) {
        fe.func();
    }
}
