package section03.chap08;
// 문자열 배열 관련 String 기능
public class Ex07 {
    public static void main(String[] args) {
        String[] strings = {"한놈", "두시기", "석삼", "너구리"};

        //  💡 join 정적 메소드(split의 반대 작용) - 문자열(정확히는 CharSequence)의 배열을 하나로 이어붙임
        //  첫 번째 인자를 각 요소 사이에 삽입
        String join1 = String.join(", ", strings);
        String join2 = String.join("-", strings);
        String join3 = String.join(" 그리고 ", strings);
        String join4 = String.join("", strings);
    }
}
