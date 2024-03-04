package section05.chap09.ex02;

public interface FoodSafety {  // 식약청이라는 인터페이스: 식약청의 기준을 준수한다는 의미
    //  ⭐️
    //  static 제거해 볼 것
    //  static abstract는 역시 불가 (추상 클래스처럼)
    static void announcement () {  // 인터페이스 자체의 클래스 메소드 (이건 매장의 기능이 아님)
        System.out.println("식품안전 관련 공지");
    }

    //  ⭐️
    // 구상이 되어 있는 메소드 (추상 메소드 아님)
    default void regularInspection () {
        System.out.println("정기 체크");
    }  //  default 제거해 볼 것 (default가 있어야 구상 메소드를 할 수 있고, 제거하면 오류)

    void cleanKitchen ();
    void employeeEducation ();
}