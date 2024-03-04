package section05.chap04.ex02;

import section05.chap04.ex01.SmartPhone;

public class Main_1 {
    public static void main(String[] args) {

        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        // import section05.chap04.ex01.SmartPhone;
        SmartPhone smartPhone = new SmartPhone();

//        String pb = smartPhone.powerButton; // ⚠️ 불가 (public 이라고 명시되어 있지 않으면 다른 패키지에서는 import 해와도 사용 불가)
        String ss = smartPhone.sdCardSlot;
    }
}
