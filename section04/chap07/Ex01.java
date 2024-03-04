package section04.chap07;

import java.util.Scanner;  // Scanner 클래스 라이브러리 추가

// 키보드 입력 받기
// 문자열 받기
public class Ex01 {
    public static void main(String[] args) {
        //  IDE가 최상단에 import java.util.Scanner 자동 작성
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();  // 💡 코드의 진행을 멈추고 입력을 기다림
        String str2 = sc.next();
        String str3 = sc.nextLine();
        // next : 스페이스를 비롯한 공백 단위로 끊어서 (토큰으로) 문자열을 받음
        // nextLine : 줄바꿈 단위로 끊어서 문자열을 받음

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
