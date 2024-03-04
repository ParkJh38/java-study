package section05.chap09.ex02;

public class Main {
    public static void main(String[] args) {

        FoodSafety.announcement();  //클래스 메소드이므로 식약청 인터페이스 자체적 실행 가능

        YalcoChicken store1 = new YalcoChicken();

        store1.regularInspection();
        store1.cleanKitchen();
        store1.employeeEducation();
    }
}
