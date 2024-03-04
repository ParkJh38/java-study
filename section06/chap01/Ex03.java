package section06.chap01;
// 자바에서는 바깥의 변수 재선언 불가
// 자바스크립트 등의 언어와 달리…
public class Ex03 {
    public static void main(String[] args) {

        String str = "바깥쪽";  // 외부에 선언된 변수를, 기능이 없는 블록이나, while문 등의 안쪽 블록에서 새로 선언해서 사용 불가
        {
//            String str = "안쪽"; // ⚠️ 불가 (바깥쪽에서 선언한 것을 같은 구역 내에서 안쪽에서 다시 덮어씌우는건 불가)
        }

        while (true) {
//            String str = "안쪽"; // ⚠️ 불가
        }
    }
}
