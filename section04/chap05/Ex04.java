package section04.chap05;

public class Ex04 {
    public static void main(String[] args) {
        double avg = getAverage(new int[] {3, 5, 4, 13, 7});

        int[] numbers = {3, 5, 9, 2, 8, 1, 4};

        //  변수에 담아 보다 효율적으로 바꿔볼 것
        int maxOfNumbers = getMaxAndMin(numbers)[0];
        int minOfNumbers = getMaxAndMin(numbers)[1];
    }

    static double getAverage (int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    //  ⚠️자바의 메소드는 하나의 값만 반환 가능
    //  여러 값을 반환하려면 배열 또는 이후 배울 객체를 활용
    static int[] getMaxAndMin (int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {  // int[] numbers = {3, 5, 9, 2, 8, 1, 4};
            max = max > num ? max : num;
            min = min < num ? min : num;
        }
        return new int[] {max, min};
    }
}

// ⭐ 디버그시 스텝인투와 스텝아웃 사용해보기  (스텝오버는 메인 메소드에서 다음 줄로 넘어가면서 디버깅인데, 내부 실행된 다른 메소드의 결과를 그냥 퉁쳐서 바로 알려줌.)
// 스텝인투는 디버깅 과정에서 메소드 안의 부분까지 들어가줌.(해당 메소드 호출되는 부분에서 메소드 내부로 들어가줌) /  스텝아웃은 다시 그 메소드에서 빠져나옴