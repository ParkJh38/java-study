package section06.chap05;
// 매개변수 전달하여 활용하 기
public class Ex02 {
    public static void main(String[] args) {

        for (var arg : args) {
            System.out.println(arg);
        }
    }
}