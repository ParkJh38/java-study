package section04.chap05;
//메소드의 의미 2. 값을 받고 연산하여 결과값을 반환 - 함수
public class Ex02 {
    public static void main(String[] args) {
        //  ⭐️ 반환한다는 것: 바꿔 쓸 수 있다는 것
        //  메서드 실행문을 메서드의 반환값으로 치환
        int int1 = add(2, 3);
        System.out.println(int1);

        System.out.println(add(4, 5));  // 바로 결과 출력

        int int2 = add(add(6, 7), add(8, 9));
        System.out.println(int2);

        //========================
        System.out.println("\n- - - - -\n");

        if (
                checkIfContain(
                        "Hello World",
                        "hello"
                )
        ) {
            System.out.println("포함됨");
        } else {
            System.out.println("포함 안 됨");
        }

        // 삼중연산자로 표현
        System.out.println(
                checkIfContain(
                        "Hello World",
                        "hello"
                ) ? "포함됨" : "포함 안 됨"
        );
    }

    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static boolean checkIfContain (String text, String token) {
        return text.toLowerCase().contains(token.toLowerCase());  // text 먼저 전부 소문자로 변환(toLowerCase) 후, 메소드 체이닝으로 이어서 contains 메소드 사용
    }                                                             // 결과로 true 또는 false 불리언 값 반환하므로 메소드 자료형은 boolean으로 선언
}
