package section06.chap04.ex01;
// 익명 클래스 (다른 클래스나 인터페이스로부터 상속받아 만들어짐 -> 주로 오버라이드한 메소드를 사용)
// 한 번만 사용되고 버려질 클래스 (이후 다시 인스턴스를 생성할 필요가 없으므로 따로 클래스명이 부여되지 않음)
import section05.chap08.ex01.*;  // 💡 와일드카드로 임포트

public class Main {
    public static void main(String[] args) {

        YalcoGroup store1 = new YalcoChicken("울산");
        YalcoGroup store2 = new YalcoCafe("창원", true);

        YalcoGroup store3 = new YalcoGroup (1, "포항") {
            // { }안에 익명 클래스 내용 작성한 것
            // 원본 메소드에 public 추가
            @Override
            public void takeOrder() {
                System.out.printf("유일한 얄코과메기 %s 과메기를 주문해주세요.%n", super.intro()
                );
            }

            public void dryFish () {
                System.out.println("과메기 말리기");
            }
        };

        var store3Intro = store3.intro();
        store3.takeOrder();
        // store3.dryFish // ⚠️ 불가 (익명 클래스의 자체적인 메소드는 세상에 이름이 알려지지 않은 자식이므로, 외부에서 호출해서 사용할 수 없음)

        System.out.println("\n- - - - -\n");

        for (var store : new YalcoGroup[] {store1, store2, store3}) {
            store.takeOrder();
        }
    }
}
