package section05.chap02.ex02;
// 정수배열 정보 클래스
// 배열을 생성자 인자로 받아, 그것의 정보를 필드들로 저장
// 복잡한 과정을 거치는 생성자의 예시
public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double average;  // 지금은 필드들의 값들을 지정해 주지 않은 상태 (0으로 기본값 들어간다)

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        // 소수부를 잃지 않도록 먼저 1.0을 곱하여 double로 만듦
        average = 1.0 * sum / nums.length;
    }
}

// ⭐️⭐️⭐️특정 기능이 있는 것이 아니어도, 복합적인 정보를 특정 형식으로 체계적으로 담기 위해 클래스와 인스턴스를 활용할 수 있다.
