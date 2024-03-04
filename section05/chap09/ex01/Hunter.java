package section05.chap09.ex01;

public interface Hunter {

    String position = "포식자"; // ⭐️ final - 초기화하지 않을 시 오류 (인터페이스는 필드값으로 상수만 가능: final 명시 불필요)
    void hunt (); // ⭐️인터페이스에 추상 메소드 들어갈 수 있다. -> 각 인터페이스를 적용한 클래스는 추상 메소드를 구상해야됨
}