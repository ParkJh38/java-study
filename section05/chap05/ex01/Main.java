package section05.chap05.ex01;

public class Main {
    public static void main(String[] args) {

        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "계룡대");

        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}
