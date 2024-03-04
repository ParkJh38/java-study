package section03.chap04;
// 단축평가 short circuit
//&& : 앞의 것이 false면 뒤의 것을 평가할 필요 없음
//|| : 앞의 것이 true면 뒤의 것을 평가할 필요 없음
// 💡하지만 뒤의 부분이 boolean을 반환하면서 부수효과를 일으키는, 어떠한 변수의 값을 변화시키는 부분이라면 고려를 해주어야 됨
public class Ex03__중요 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3);  // 앞부분이 true 이므로 뒷부분도 확인을 했을 것.(c와 d도 반영됨)
        boolean bool2 = a < b || e++ < (f += 3);  // 앞부분이 true 이므로 뒷부분 확인할 필요 x (e와 f는 반영 x)

        boolean bool3 = a > b && c++ < (d += 3);  // 앞부분이 false 이므로 뒷부분 확인할 필요 x (c와 d는 반영 x)
        boolean bool4 = a > b || e++ < (f += 3);  // 앞부분이 false 이므로 뒷부분 확인을 했을 것. (e와 f도 반영됨)
    }
}
