package section03.chap01;
// 비교 연산자
public class Ex09 {
    public static void main(String[] args) {
        //  값을 바꿔가면서 실행해 볼 것
        int int1 = 3;
        int int2 = 3;

        //  다른 정수 자료형끼리 사용 가능
        boolean bool1 = int1 == int2;
        boolean bool2 = int1 != int2;

        boolean bool3 = int1 > int2;
        boolean bool4 = int1 >= int2;

        boolean bool5 = int1 < int2;
        boolean bool6 = int1 <= int2;

        //  💡 우선순위에 따른 연산
        boolean bool7 = int1 * int2 > int1 + int2;   // *, +연산자가 비교연산자 >보다 우선순위 높다

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);
        System.out.println(bool5);
        System.out.println(bool6);
        System.out.println(bool7);
    }
}
