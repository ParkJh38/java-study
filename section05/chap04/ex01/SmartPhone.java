package section05.chap04.ex01;

public class SmartPhone {

    String powerButton = "OnOff";  // default 상태
    public String sdCardSlot = "SD Card";
    // 클래스 내부가 아닌 Main과 같은 다른 메소드에서 인스턴스를 사용할때 앞에
    // private 로 지정된 것은 직접 손대지 못하게 보호막을 쳐둔것
    private String cpu = "Yalcom";
}