package section03.chap03;

public class Ex01 {
    public static void main(String[] args) {
        //  각 문자는 상응하는 정수를 가짐 (ASCII 코드)
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'a';
        char ch4 = 'a' + 1;             // 각 문자에는 정수값을 더할 수도 있다. (문자의 아스키코드 값에 그 정수 만큼 더해짐)
        String str = "a" + 1;           // 문자열에 정수값을 더하면 그대로 이어서 붙여쓰는 방식으로 출력됨
        char ch5 = '가';
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나';

        int ch1Int = (int) ch1;
        int ch9Int = (int) ch9;

        // 문자 리터럴과 숫자, ***유니코드로 표현 가능
        char ch10 = 'A';
        char ch11 = 65;
        char ch12 = '\u0041';
    }
}
