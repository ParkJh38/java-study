package section02.chap03;

public class Ex05 {
    public static void main(String[] args) {
        // 상수
        // ** final 연산자: 변수의 값을 바꾸지 못하게 만듦 (C 언어에서의 const 와 같은 원리)
        final int INT_NUM = 1;    // 일반적으로 변하지 않는 상수값 명명할때는 대문자로 이름을 짓는다.
//        INT_NUM = 2; //불가능

        // 자바의 식별자 명명 규칙
        // 문자, 숫자, 언더스코어(_), 달러사인($) 포함가능, 공백은 포함 불가
        // 문자 또는, _, $가 먼저 나와야 됨 (숫자먼저 등장 x)

        // 사용가능한 명명 예시'
        int batman, _batman, $batman, 배트맨;
        // 사용 불가능
//        int 1batman; 숫자 먼저 등장 불가능
//        int bat man; 공백 포함 불가능
//        int #batman; #문자 사용 불가능

        // 예약어(이미 자바에서 특정 의미를 갖고 있는 단어들은 식별자 명명에 사용할 수 없음. 다른 언어에서도 대부분 같음
//        int double;
//        boolean instanceof;
//        char new;
//        int, boolean, char 등은 식별자 명명에 사용 불가능

    }
}
