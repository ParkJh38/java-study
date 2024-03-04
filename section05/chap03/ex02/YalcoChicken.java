package section05.chap03.ex02;
// 매장 번호 자동 생성
public class YalcoChicken {

    static String brand = "얄코치킨";
    static String contact () {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }
    static int lastNo = 0; // ⭐️ 마지막으로 생성한 매장 번호

    int no; // 인스턴스의 필드(몇호점)
    //int no = ++lastNo; // 이렇게 해도 됨 (이렇게하면 아래 생성자에서 no = ++lastNo; 안써도 됨)

    String name;

    YalcoChicken(String name) {
        // 클래스 변수를 활용하여 생성마다 새 번호 부여 (또는 위처럼)
        no = ++lastNo;   // 알아서 번호 부여됨
        this.name = name;
    }

    String intro () {
        return "안녕하세요, %s %d호 %s호점입니다." // 🔴
                .formatted(brand, no, name);
    }
}
