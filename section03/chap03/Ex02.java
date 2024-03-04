package section03.chap03;

public class Ex02 {
    public static void main(String[] args) {
        char ch_a1 = 'A';
        int int_a1 = (int) ch_a1;    // char형 문자를 int형으로 형변환을 하고 int형 변수에 넣거나
        int int_a1_1 = ch_a1;        // int형으로 형변환을 하지 않아도 int형 변수에 넣을 수 있음

        //  정수값을 얻는 다른 방법들 - 정수값과 연산하기
        int int_a2 = ch_a1 + 0;
        int int_a3 = ch_a1 - 0;
        char int_a2_1 = ++ch_a1;        // 최종 자료형이 char이므로 ++ch_a1을 정수취급하여 연산했지만 'B'로 출력
        char int_a3_1 = --ch_a1;        // 최종 자료형이 char이므로 --ch_a1을 정수취급하여 연산했지만 'A'로 출력

        //  💡 리터럴에 더할 때와 변수에 더할 때 반환 자료형이 다름
        char ch_a2 = 'A' + 1;
        //char ch_a3 = ch_a1 + 1; // ⚠️ 불가 (참고)
        int int_a4 = ch_a1 + 1;

        //  💡 int 1과 char '1'은 다름! - 문자로서의 '1'
        //  - 해당 문자의 정수값 확인
        char ch_b1 = '1';
        char ch_b2 = '2';

        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
        char ch_b3 = '1' + '2';
        int int_b4 = ch_b1 + ch_b2;

        //  💡 아래의 기능으로 문자가 의미하는 정수로 변환
        int int_d1 = Character.getNumericValue('1');
        int int_d2 = Character.getNumericValue('2');
        // or 아래 방법이 더 좋을수도
        int int_d1_1 = '1' - '0';  // '0'을 뺴면서 아스키 코드의 차이만큼이 해당 문자의 정수 크기
        int int_d2_2 = '5' - '0';


        //  ⚠️ 빈 문자는 사용 불가, 공백(space)는 가능
        //  - 이후 배울 문자열(String)과의 차이
//        char empty = '';    // 문자 자료형에서는 ' '안에 아무것도 안들어가는건 허용 x
        String emptyStr = ""; // 문자열 자료형에서는 "" 가능 <- 문자열은 0개부터 다수의 문자들이 들어갈 수 있기 때문(0개부터 가능)

        char space = ' ';                   // space: ' ' 도 아스키코드에서 확인해보면 하나의 문자이다
    }
}
