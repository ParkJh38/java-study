package section02.chap03;

public class Ex02 {
    public static void main(String[] args) {
        // 변수 사용하지 않고 출력
        System.out.println("원주율: " + 3.14);
        System.out.println("원의둘레: 지름 x " + 3.14);
        System.out.println("원의 넓이: 반지름의 제곱 x " + 3.14);
        System.out.println("구의 부피: 반지름의 세제곱 x 4/3 x " + 3.14);

        System.out.println("\n- - - - - - -\n"); // \n: 줄바꿈

        double pi = 3.14;

        System.out.println("원주율: " + pi);
        System.out.println("원의둘레: 지름 x " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 x " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 x 4/3 x " + pi);

        System.out.println("\n- - - - - - \n");

        pi = 3.14159265358979;

        System.out.println("원주율: " + pi);
        System.out.println("원의둘레: 지름 x " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 x " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 x 4/3 x " + pi);

        // 자바의 변수: 앞에 담을 데이터의 자료형을 명시(자료형도 같이 선언해야 비로소 변수를 선언한것)
        int age;
        age = 24;

        System.out.println("age: " + age);

    }

}





