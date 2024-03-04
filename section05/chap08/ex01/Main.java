package section05.chap08.ex01;

public class Main {
    public static void main(String[] args) {

        //  ⚠️ 불가 (abstract class에서는 인스턴스 생성 불가)
//        YalcoGroup yalcoGroup = new YalcoGroup(1, "서울");

        YalcoChicken ychStore1 = new YalcoChicken("판교");
        YalcoChicken ychStore2 = new YalcoChicken("강남");

        YalcoCafe ycfStore1 = new YalcoCafe("울릉", true);
        YalcoCafe ycfStore2 = new YalcoCafe("강릉", false);

        // 추상 클래스도 다형성 구현됨
        // 얄코치킨과 얄코카페의 매장은 얄코그룹 소속
        YalcoGroup[] ycStores = {
                ychStore1, ychStore2,
                ycfStore1, ycfStore2
        };

        for (YalcoGroup ycStore : ycStores) {
            ycStore.takeOrder();
        }

        System.out.println("\n- - - - -\n");

        System.out.println(YalcoChicken.getCreed());
        System.out.println(YalcoCafe.getCreed());
    }
}
