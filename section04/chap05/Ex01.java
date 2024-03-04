package section04.chap05;
//타 언어의 함수 function 과 같은 개념
//자바는 모든 것이 클래스의 요소이므로 메소드 method 라 부름

//메소드의 의미 1. 반복을 최소화
public class Ex01 {
    public static void main(String[] args) {
//        double x = 3, y = 4;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 10; y = 2;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 7; y = 5;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);

        double x = 3, y = 4;
        Calculate(x, y);
        System.out.println("\n");

        x = 10; y = 2;
        Calculate(x, y);
        System.out.println("\n");

        x = 7; y = 5;
        Calculate(x, y);
    }

    //  ⭐️ 메인 메소드 외부에 선언할 것
    static void Calculate (double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }

}


