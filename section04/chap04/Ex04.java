package section04.chap04;
// 중첩 예제
public class Ex04 {
    public static void main(String[] args) {
        final int LINE_WIDTH = 5;

        int lineWidth = LINE_WIDTH;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈용도 Enter와 동일
        }

        //  for 문으로 다시 작성
        for (int i = LINE_WIDTH; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
