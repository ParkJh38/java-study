package section03.chap08;
// ⭐⭐원시자료형(primitive type) vs 참조자료형(reference type)
// 원시자료형 배열은 그 값들이 직접적으로 배열에 들어가는 것
// 참조자료형 배열은 값들이 저장된 주소가 배열의 요소로 들어가는 것
public class Ex04 {
    public static void main(String[] args) {
        //  🧪 디버깅해서 결과를 볼 것
        //  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨

        boolean bool1 = true;
        boolean bool2 = false;
        bool2 = bool1;
        bool1 = false;

        int int1 = 1;
        int int2 = 2;
        int2 = int1;
        int2 = 3;

        char ch1 = 'A';
        char ch2 = 'B';
        ch2 = ch1;
        ch1 = '가';

        //  ⭐ 참조 자료형은 값 주머니의 주소를 복사
        //  두 변수가 같은 주머니를 가리키게 됨

        boolean[] boolAry1 = { true, true, true };
        boolean[] boolAry2 = { false, false, false };
        boolAry2 = boolAry1;
        boolAry1[0] = false;

        int[] intAry1 = { 1, 2, 3 };
        int[] intAry2 = { 4, 5 };
        intAry2 = intAry1;
        intAry2[1] = 100;

        char[] chAry1 = { 'A', 'B', 'C' };
        char[] chAry2 = { 'a', 'b', 'c', 'd', 'e' };
        chAry2 = chAry1;  // 배열의 주소를 복사하는 것이다
        chAry1[2] = '다';

        // ⭐⭐포인터처럼 배열의 주소를 공유하는 것이기 때문에 한쪽을 바꾸면 다른 배열로 같이 바뀌는 셈이다

    }
}
