package section04.chap06;
// ⭐️원시형 매개변수 vs 참조형 매개변수
public class Ex02 {
    public static void main(String[] args) {
        int intNum = 3;
        modifyIntArg(intNum);


        int[] intNums = {1, 2, 3};
        //  배열은 참조형이지만 그 안의 값들은 원시형
        modifyIntArg(intNums[0]);  // 배열의 주소값이 아닌 배열의 원소를 가져온거라 복사본이 들어간 것으로 원본에 영향 x

        //  참조형인 배열 자체를 인자로 사용 (배열의 주소가 복사되는 것)
        // ⭐ 참조형 변수를 인자로 사용할 때는 이 점을 유의할 것!
        modifyAryElem(intNums);
    }

    //  ⭐️ 원시값은 '복사해서' 가져옴
    //  메소드 내부에서 값을 변경해도 원본에 영향 끼치지 않음
    static void modifyIntArg (int num) {
        System.out.printf("수정 전: %d%n", num++);
        System.out.printf("수정 후: %d%n", num);
    }

    //  ⭐️ 참조값은 주소값이므로 원본 그 자체를 가리킴
    static  void modifyAryElem (int[] ary) {
        System.out.printf("수정 전: %d%n", ary[1]++);
        System.out.printf("수정 후: %d%n", ary[1]);
    }
}
