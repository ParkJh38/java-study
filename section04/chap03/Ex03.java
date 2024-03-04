package section04.chap03;
// 배열의 루프
public class Ex03 {
    public static void main(String[] args) {
        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }

        //  💡 배열 순환 (기본적인 방법)
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }

        System.out.println("\n- - - - -\n");
        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용 -> 이 방법이 좋다. 위에 일반적인 방법처럼하면 추가 변수 사용 등 오류가 날 가능성이 높아짐
        for (int num : multiOf4) {  // ':' 오른쪽에는 순회할 배열이나 리스트와 같은 콜랙션이 온다. 한 턴마다 왼쪽의 변수에 배열의 각 요소를 하나씩 넣는다.
            System.out.println(num);  //  // num:4, num:8, num:12...
        }

        System.out.println("\n- - - - -\n");
        // ⭐️ IntelliJ IDEA 단축어 : foreach
        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        // 배열의 특정 개수만 사용할 때는 for 문, 전부 사용할 때는 foreach 문
        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) {
            System.out.println(s);
        }

    }
}
