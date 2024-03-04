package section03.chap06;
// 문자 반환
public class Ex03 {
    public static void main(String[] args) {
        String str1 = "널 다시 만날 수만 있다면 얼마나 좋을까";

        // charAt: ~번째 문자 반환
        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(5);

        // 마지막 문자 얻기 (-1 안해주면 문자열 길이 넘어감)
        char ch3 = str1.charAt(str1.length() - 1);

        //============================================================
        // 문자(열)의 위치 반환
        String str2 = "나에게 꿈이 하나 있다면 그 하나의 꿈은 아마도";

        // indexOf/lastIndexOf: 일치하는 첫/마지막 문자열의 위치
        // 앞에서부터 카운트해서 int로 반환

        // 두번째 인자: ~번째 이후/이전부터 카운트
        int int1 = str2.indexOf('꿈');
        int int2 = str2.indexOf('꿈', 5);  // 인자를 두개 받는 것은, 그 인덱스 이후로 찾는 인자가 몇번째 인덱스에 있는지 알려줌

        int int3 = str2.indexOf("하나");
        int int4 = str2.lastIndexOf("하나");  // 찾고자 하는 인자가 마지막으로 등장하는 인덱스
        int int5 = str2.lastIndexOf("하나", 15);  // 그 인덱스 이후로 찾고자 하는 인자가 마지막으로 등장하는 인덱스

        // 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('없');

    }
}
