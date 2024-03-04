package section05.chap01.ex02;

public class Main {
    public static void main(String[] args) {
        //  본사 소속의 매장(인스턴스 매장)을 내는 코드
        YalcoChicken store1 = new YalcoChicken();  // 인스턴스의 변수 명은 프로그램 내에서만 사용됨(밖으로는 유출되지 않음)
        // no = 0, name = null
        store1.no = 3; // 🔴
        store1.name = "판교";

        YalcoChicken store2 = new YalcoChicken();
        store2.no = 17;  // 인스턴스 store2의 필드
        store2.name = "강남";


        //  인스턴스의 필드들에 접근
        int store1No = store1.no;
        String store2Name = store2.name;
        //  인스턴스의 메소드 호출
        String store1Intro = store1.intro();
        String store2Intro = store2.intro();
    }
}
