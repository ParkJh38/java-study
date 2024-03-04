package section02.chap03;

public class Ex04 {
    public static void main(String[] args) {
        // 쉽표를 사용하여 여러개를 한 줄에 선언하고 초기화 가능하다
        // 대신 모두 같은 자료형이어야 된다
        char ch1, ch2, ch3;
        char ch4 = 'A', ch5 = 'B', ch6 = 'C';

        // ** 같은 변수를 두번 선언하는 것은 불가
        int number = 1;
        //int number = 2;

        //변수를 선언 & 초기화를 하기 전까지는 변수 사용 불가
        //System.out.println(letter); -> 변수 선언하지 않아 사용 불가
        char letter = 'A';
        System.out.println(letter);

        int numberA = 1;
        // 주머니의 값을 다른 주머니에 넣기
        int numberB = numberA;
        numberA = 2;  // numberA의 값을 numberB에 넣고, numberA의 값 새로 할당
    }
}
