package section03.chap02;

public class Ex05 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 2f;
        double dbl1 = 3;
        double dbl2 = 7;

        //  💡 정수 자료형과 실수 자료형의 계산은 실수 반환
//        int flt2 = int1 / flt1; // ⚠️ 불가
        double dbl3 = int1 / dbl1;
        double dbl4 = dbl2 / int1;

        //  💡 리터럴로 작성시 double임을 명시하려면 .0을 붙여줄 것
        double dbl5 = 5 / 2;            // 정수 자료형은 나누기를 했을때 소수점 뒤에는 버림
        double dbl6 = 5.0 / 2;          // 정수와 실수를 같이 계산하면 자동으로 정수도 실수로 보정한 뒤에 계산됨
        double dbl7 = (double) 5 / 2;   // 명시적 형변한은 5에만 했지만, 실수 정수 계산이되므로 정수 2도 실수로 보정하여 계산됨

        float fltNum = 4.567f;
        double dblNum = 5.678;

        //  💡 정수 자료형에 실수를 강제로 넣으면 소수부를 '버림'
        int int2 = (int) fltNum;
        int int3 = (int) dblNum;
    }
}
