package section04.chap04;
// do ... while : 일단 수행하고 조건을 봄(선 조치 후 조건) 일단 한번 실행하고 본다.
public class Ex03 {
    public static void main(String[] args) {
        int enemies = 2;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies == 0){
                System.out.println("사격중지 아군이다");
            }
            if (enemies > 0){
                enemies--;
                if (enemies == 0){
                    System.out.println("적군이 모두 사살되었다. 사격중지");
                }
            }
        } while (enemies > 0);


        //=====================================================================================================
        System.out.println("\n- - - - -\n");

        int x = 7; // 10 이상으로 바꿔서 다시 실행해 볼 것
        int y = x;

        while (x < 10) {
            System.out.println("while 문: " + x++);
        }
        do {
            System.out.println("do ... while 문: " + y++);
        } while (y < 10);
    }
}
