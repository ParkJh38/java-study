package section04.chap07;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (sc.hasNextInt()) {
//            int repeatCount = sc.nextInt();  // 정수 입력 받으면 그것을 repeatCount에 넣고
//
//            //  ⚠️ nextInt를 아래에서 바로 사용하면 루프마다 받음
//            //  repeatCount 변수에 담은 이유
//            for (int i = 0; i < repeatCount; i++) {  // repeatCount 반복 횟수만큼 반복 출력
//                //  💡 print (ln이 붙지 않은) : 같은 줄에 이어 출력
//                System.out.print("호우 ");
//            }
//            System.out.println("");
//        }
//
//        sc.close();

        //=================================================================================
        //  문자열 바로 입력하여 사용하기
        String [] strInputs = new String [5];

        for (int i = 0; i < strInputs.length; i++) {
            strInputs[i] = sc.nextLine();
        }

        sc.close();

        for (String str : strInputs) {
            System.out.println(str);
        }
    }
}
