package section03.chap01;
// 형변환 casting
public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallIntNum = 123;

        // 명시적(강제) 형변환
        byteNum = (byte) smallIntNum;
        // 원래 더 작은 자료형에 큰 자료형 값 넣으면 오류 뜨는데 강제로 개발자가 진행시키는 것.
        // 강제로 int형을 byte형으로 낮춰서 형변환해서 문제 없음

        int intNum = 12345;
        // 강제로 범주 밖의 값을 넣을 경우 값이 손실될 수 있다
        byteNum = (byte) intNum;  // 12345 % 128
    }
}
