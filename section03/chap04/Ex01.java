package section03.chap04;
// Boolean 자료형 (1바이트.8bit 공간 차지) -> 컴터가 메모리상에서 집을 수 있는 가장 작은 단위가 1바이트라 호환성을 위함
public class Ex01 {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = !true;   // 부정연산자
        boolean bool4 = !false;

        boolean bool5 = !!bool3;   // 누적 부정연산자
        boolean bool6 = !!!bool3;

        boolean bool7 = !(1 > 2);
        boolean bool8 = !((5 / 2) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));  // !(true != true) = true
    }
}
