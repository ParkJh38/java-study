package section05.chap01.ex03;

public class Main {
    public static void main(String[] args) {

        //  클래스로 인스턴스를 생성 - 💡 new 연산자 + 생성자 호출
        //  본사의 방침대로 매장을 내는 것
        // YalcoChicken.java의 YalcoChicken (int no, String name) { } 생성자를 호출
        YalcoChicken store1 = new YalcoChicken(3, "판교");
        YalcoChicken store2 = new YalcoChicken(17, "강남");
        YalcoChicken store3 = new YalcoChicken(24, "제주");

        // 각 인스턴스의 메서드 호출한 후, 그 문자열을 문자열 배열에 저장
        String[] intros = {store1.intro(), store2.intro(), store3.intro()};
    }
}
