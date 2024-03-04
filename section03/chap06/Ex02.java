package section03.chap06;
// 빈 문자열 여부
public class Ex02 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " \t\n";

        int int1 = str1.length();
        int int2 = str2.length();  // 스페이스, Tab, Enter 모두 하나의 문자로 봄

        // isEmpty: 문자열의 길이가 0인지 여부 판별
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        // isBlank: 공백(white space)를 제회한 문자열의 길이가 0인지 여부 판별
        boolean bool3 = str1.isBlank();
        boolean bool4 = str1.isBlank();

        //=================================================================
        // 트리밍
        String str3 = "\t T H E B A T M A N \n";

        // trim: 앞 뒤의 공백(white space)문자 제거
        String str4 = str3.trim();

        // 변수 그 자체에 적용하기
        // -문자열은 불변: 변수가 가리키는 종이를 바꾸는 것
    //    str3 = str3.trim();

    }
}
