package section03.chap04;
// 논리 연산자
public class Ex02 {
    public static void main(String[] args) {
        // &&(and)연산자의 경우에는 true가 나올려면 둘다 true이어야 됨
        boolean bool1 = true && true;
        boolean bool2 = true && false;
        boolean bool3 = false && true;
        boolean bool4 = false && false;

        // ||(or)연산자의 경우에는 true가 나올려면 둘중에 적어도 하나가 true이면 됨 (false || false 이면 false)
        boolean bool5 = true || true;
        boolean bool6 = true || false;
        boolean bool7 = false || true;
        boolean bool8 = false || false;


        int num = 4;
        boolean isPositiveAndOdd = num >= 0 && num % 2 == 1;  // 양의 정수인 홀수인가
        boolean isPositiveOrOdd = num >= 0 || num % 2 == 1;  // 양의 정수이거나 홀수인가

        boolean isPositiveAndEven = num >= 0 && num % 2 == 0;  // 양의 정수인 짝수인가
        boolean isPositiveOrEven = num >= 0 || num % 2 == 0;  // 양의 정수이거나 짝수인가

        num = 6;
        //  💡 &&가 ||보다 우선순위 높음
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);
    }
}
