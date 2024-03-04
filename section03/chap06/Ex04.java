package section03.chap06;
// 값 동일 여부 확인
public class Ex04 {
    public static void main(String[] args) {
        // equals: 대소문자 구분하여 비교
        String str_a1 = "Hello World";
        String str_a2 = new String("Hello World");
        String str_a3 = "HELLO WORLD";

        boolean bool_a0 = str_a1 == str_a2; // 문자열의 비교는 이 방법 사용하지 말 것!!

        boolean bool_a1 = str_a1.equals(str_a2);
        boolean bool_a2 = str_a1.equals(str_a3);

        // equalsIgnoreCase: 대소문자 구분하지 않고 비교
        boolean bool_a3 = str_a1.equalsIgnoreCase(str_a3);
        boolean bool_a4 = str_a2.equalsIgnoreCase(str_a3);

        //==============================================================================
        // 포함 여부 확인
        String str_b1 = "브루스웨인은 사실은 고담시의 배트맨입니다.";

        // contains: 포함 여부
        boolean bool_b1 = str_b1.contains("고담시");
        boolean bool_b2 = str_b1.contains("배트맨");

        // startsWith: (주어진 위치에서) 해당 문자열로 시작 여부 확인
        boolean bool_b3 = str_b1.startsWith("사실은");
        boolean bool_b4 = str_b1.startsWith("브루스웨인");
        boolean bool_b5 = str_b1.startsWith("브루스웨인", 0);

        // endsWith: 해당 문자열로 끝남 여부 확인
        boolean bool_b6 = str_b1.endsWith("배트맨입니다.");
        boolean bool_b7 = str_b1.endsWith("배트맨");

        //=================================================================================
        // 정규표현식 일치 여부 확인
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        String str_c1 = "yalco@yalco.kr";
        String str_c2 = "yalco.yalco.kr";
        String str_c3 = "yalco@yalco@kr";

        boolean bool_c1 = str_c1.matches(emailRegex);
        boolean bool_c2 = str_c2.matches(emailRegex);
        boolean bool_c3 = str_c3.matches(emailRegex);

    }
}
