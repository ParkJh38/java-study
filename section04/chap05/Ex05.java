package section04.chap05;
// 매개변수의 개수가 정해지지 않은 메소드
public class Ex05 {
    public static void main(String[] args) {
        double avg = getAverage(3, 91, 14, 27, 4);

        //  💡 배열을 넣으면 자동으로 펼쳐져 인식됨
        int[] numbers = {3, 91, 14, 27, 4};
        double avgOfArr = getAverage(numbers);


        String class3Desc = descClass(3, "목아진", "짱구", "철수", "훈이");

        String[] kids = {"짱구", "철수", "훈이"};
        String class3DescByArr = descClass(3, "목아진", kids);
    }


    static double getAverage(int... nums) {
        //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
        // double avg = getAverage(3, 91, 14, 27, 4); 와 같이 메소드를 호출하는 코드에서
        // 인자로 몇개가 들어올지 모를때. 해당 값들이 몇개가 들어오든 nums 배열로 들어오도록 설계 (유연하게 사용가능!!!)

        //  int[] (배열 자체를 받음)과는 다름!
        //  💡 배열을 넣으면 자동으로 펼쳐져 인식됨
        //  int[] numbers = {3, 91, 14, 27, 4};
        //  double avgOfArr = getAverage(numbers);
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }

    //  ⭐️ But 다른(정해진) 인자들과 사용시 맨 마지막에 놓을 것
    static String descClass (int classNo, String teacher, String... kids) {
        return "%d반의 담임은 %s 선생님, 원생들은 %s 입니다."
                .formatted(classNo, teacher, String.join(", ", kids));
    }
}
