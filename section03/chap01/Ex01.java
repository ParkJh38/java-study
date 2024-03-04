package section03.chap01;
// **** chap01. 정수 자료형들과 관련 연산자 ****
// 자료형의 종류
public class Ex01 {
    public static void main(String[] args) {
        byte    _1b_byte = 1;
        short   _2b_short = 2;
        int     _4b_int = 3;  // 일반적으로 int 자료형을 널리 사용
        long    _8b_long = 4;
        // byte: 1byte(8bit), short: 2byte, int: 4byte, long: 8byte
        // 대부분의 컴퓨터에서 1byte = 8bit
        // 자료형의 범주를 넘어가는 값을 담을 수 없다.
        byte overByte1 = 127;
//        byte overByte2 = 128;  // 범주를 넘어가서 오류 (byte 범주: -128 ~ 127)
        byte overByte3 = -128;
//        byte overByte4 = -129;  // 범수를 넘어가서 오류 (byte 범주: -128 ~ 127)

        // 큰 자료형에 작은 자료형의 값을 넣을 수는 있다
        // 묵시적(암시적) 형변환
        _2b_short = _1b_byte;
        _4b_int = _1b_byte;
        _4b_int = _2b_short;
        _8b_long = _1b_byte;
        _8b_long = _2b_short;
        _8b_long = _4b_int;

        // 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수는 없다 (들어있는 값의 크기와 무관. 그냥 시도하지 말자)
//        _1b_byte = _2b_short;
//        _1b_byte = _4b_int;
//        _1b_byte = _8b_long;
//        _2b_short = _4b_int;
//        _2b_short = _8b_long;
//        _4b_int = _8b_long;

        // int의 범위를 벗어나는 수에는 리터럴(변수값에 해당하는 값)에도 명시를 해주어야 된다.
        // 끝에 알파벳 l 또는 L을 붙여 준다
        long _8b_long1 = 123456789123456789L;  // 리터럴의 끝에 L을 써서 명시를 해주어야 오류 안뜬다

        // 가독성을 위해 아래와 같이 끊어쓰기로 표현가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long2 = 123_456_789_123_456_789L;


    }
}
