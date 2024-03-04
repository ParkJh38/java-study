package section03.chap04;
// 삼항 연산자 (a ? b : c)
// a : 불리언 값
// b : a가 true 일 때 반환될 값
// c : a가 false 일 때 반환할 값
public class Ex04 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4;
        char num1OE = num1 % 2 == 1 ? '홀' : '짝';  // num10E의 자료형은 삼항 연산자의 반환값의 자료형에 맞춘다
        char num2OE = num2 % 2 == 1 ? '홀' : '짝';


        int num = 3;
        //  아래 값들을 바꿔가며 실행해 볼 것
        boolean mult2 = true;
        //mult2 = false;
        boolean plus5 = true;
        //plus5 = false;

        // 다중 삼항 연산자 예제
        System.out.println(
                (!mult2 && !plus5) ? num               // false이므로 line23~ 부터의 값 반환
                        : (mult2 && plus5) ? num * 2 + 5  // 두번째 삼항 연산자. true 이므로 num*2+5 반환
                        : mult2 ? num * 2
                        : num + 5
        );


        int x = 1, y = 2;
        //  💡 단축평가 적용됨
        int changed1 = x < y ? (x += 2) : (y += 2);
        int changed2 = x < y ? (x += 2) : (y += 2);
        int changed3 = x < y ? (x += 2) : (y += 2);
        int changed4 = x < y ? (x += 2) : (y += 2);
        int changed5 = x < y ? (x += 2) : (y += 2);
    }
}
