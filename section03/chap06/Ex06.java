package section03.chap06;
// 대소문자 변환
public class Ex06 {
    public static void main(String[] args) {
        String str_a1 = "Hello, there";

        // toUpperCase / toLowerCase: 모두 대문자/소문자로 변환
        String str_a2 = str_a1.toUpperCase();
        String str_a3 = str_a1.toLowerCase();

        String str_b1 = "Manners1, Manners2 radio check. Your voice loud and clear.";
        String str_b2 = "radio";

        boolean bool_b1 = str_b1.contains(str_b2);

        // 영문 텍스트에서 대소문자 무관 특징 텍스트 포함 여부 확인시
        boolean bool_b2 = str_b1
                .toUpperCase()
                .contains(str_b2.toUpperCase());

        boolean bool_b3 = str_b1
                .toLowerCase()
                .contains(str_b2.toLowerCase());

    }
}
