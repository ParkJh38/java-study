package section04.chap06;
// 메소드 오버로딩 (Ex. 코카콜라도 같은 제품명이지만 사이즈별로 여러가지가 있는 것처럼)
// 같은 메소드 이름, 다른 매개변수 (메소드 이름은 같지만 버전이 여러개인 것)
// 다른 자료형의 값들로 같은 성질의 작업을 정의할 때
public class Ex01 {
    public static void main(String[] args) {
        int res1 = add(1, 2); // 🔴 스텝인투로 들어가 볼 것
        int res2 = add(3, 4, 5);
        double res3 = add(1.2, 3.4);
        String res4 = add("아이언맨", 'V');
        String res5 = add('X', "Men");
    }

    // 메소드의 이름은 add로 모두 동일하지만, 파라미터가 다르기 때문(개수, 자료형)에 모두 다른 메소드로 인식됨 (컴파일 오류 X)
    static int add(int a, int b) { return a + b; }

    //  매개변수의 개수가 다름
    static int add(int a, int b, int c) { return a + b + c; }

    //  매개변수의 자료형이 다름
    static double add(double a, double b) { return a + b; }

    //  매개변수의 자료형 순서가 다름
    static String add(String a, char b) { return a + b; }
    static String add(char a, String b) { return a + b; }

    //  ⚠️⚠️ But, 파라미터가 같은 상황에서 반환 자료형이 다른 것은 오버로딩 안 됨 - 다른 메소드 이름을 사용해야됨
    //  static double add(int a, int b) { return (double) (a + b); }
}
