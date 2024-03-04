package section06.chap03.ex02;

public class Main {
    public static void main(String[] args) {

        YalcoChicken.LaunchTF launchTF1 = new YalcoChicken.LaunchTF("마산", "김영희");  // 본사에서 관리하는 내부 팀이므로 바로 접근해서 사용가능 (LaunchTF의 생성자를 사용)
        YalcoChicken.LaunchTF launchTF2 = new YalcoChicken.LaunchTF("영월", "이철수");  // LanchTF가 정적 요소인거지 이 인스턴스가 정적요소는 아님

        YalcoChicken store1 = launchTF1.launch();
        YalcoChicken store2 = launchTF2.launch();

        YalcoChicken.Gift [] gifts = {  // 각 매장에서 Gift의 제품을 인스턴스로 생성하여 반환하는 메소드를 사용
                store1.getGift("홍길동"),
                store1.getGift("전우치"),
                store2.getGift("옥동자")
        };

    }


}
