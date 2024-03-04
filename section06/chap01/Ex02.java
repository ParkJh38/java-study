package section06.chap01;
// 메소드와 클래스의 스코프
public class Ex02 {
    public static void main(String[] args) {
//        System.out.println(a); // ⚠️ 클래스 메소 드에서 인스턴스 필드 사용 불가 (본사에 가서 강남점 매장 전번 물어보는건 안됨)
    }

//    private String y = x; // ⚠️ 클래스 내 필드의 스코프 : 해당 클래스 안
    private int a = 1;
    private int b = a + 1;
//    private int c = d + 1; // ⚠️ 메소드 내 변수의 스코프 : 해당 메소드 안

    public void func1 () {
        System.out.println(a + b);
        int d = 2;  // d는 여기 메소드 안에서 선언되었기에, 밖에서 사용 불가
    }
//    public void func2 () {
//        System.out.println(d); // ⚠️
//    }
}
