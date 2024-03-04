package section06.chap01;

public class Ex04 {

    public static void main(String[] args) {  // 클래스 내부의 main 메소드
        new Ex04().printKings();
    }

    String king = "사자";  // 클래스의 필드에서 선언, 초기화 진행

    void printKings () {
        String king = "여우"; // 💡 그럼 이건 뭔가요?? 이건 메소드 안에서 선언된 변수 (메소드 내의 변수와 클래스의 필드에서 선언된 변수는 다른 영역으로 간주)

        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf(
                "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                this.king, king  // 인스턴스를 나타내는건 this로 구분.
        );
    }
}
