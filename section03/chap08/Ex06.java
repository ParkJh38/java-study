package section03.chap08;

public class Ex06 {
    public static void main(String[] args) {
        //  상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        //  ⚠️ 다른 배열을 할당하는 것은 불가 (이미 사용중인 배열에 있는 값들을 새로 덮어씌우는 건 불가)
//        NUMBERS = new int[] {2, 3, 4, 5, 6};

        //  ⭐️ 배열의 요소를 바꾸는 것은 가능
        NUMBERS[0] = 11;

        // 즉, 배열의 집주소를 바꿀수는 없지만 안에 있는 가구들은 바꿀수 있다.
    }
}
