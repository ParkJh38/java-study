package section04.chap04;

public class Ex02 {
    public static void main(String[] args) {
        //  100보다 작은 3의 배수들 출력해보기

        // ⚠️ 의도대로 작동하지 않음.(무한루프에 빠짐) 이유는?
//        int i = 1;
//        while (true) {
//            if (i % 3 != 0) continue;  // continue는 한 루프를 건너뛰는 것인데 그러면 다시 while루프로 돌아와도 i=1상태이다. 따라서 무한반복 단계에 들어감
//            System.out.println(i);
//
//            if (i++ == 100) break;
//        }

        // 위 코드를 수정한 코드. 하지만 i로 할수 없어서 (i-1)을 쓰는 코드라 가독성이 조금 떨어짐
        int i = 1;
        while (true) {
            if (i++ == 100) break;
            if ((i - 1) % 3 != 0) continue;

            System.out.println(i - 1);
        }


        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        int j = 1;
        while (true) {
            int cur = j++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);

        }
    }
}
