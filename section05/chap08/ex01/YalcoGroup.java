package section05.chap08.ex01;
// 추상 클래스 (병상에 있는 parent Class) 기능을 덜어낸 것이다.
// 상속 받은 자식 클래스에서만 인스턴스 생성 가능
public abstract class YalcoGroup {

    protected static final String CREED = "우리의 %s 얄팍하다";

    //  💡 클래스 메소드는 abstract 불가
    //  abstract static String getCreed ();

    protected final int no;
    protected final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다.".formatted(no, name);
    }
    //  이후 다른 패키지에서의 실습을 위해 public으로

    //  💡추상 클래스 메소드 (뒤에 구현부가 작성되어 있지 않음)
    // abstract 메소드: 스스로는 선언만 하고 구현하지 않음 (**자식 클래스에서 구현)
    // 접근제어자 의미없음 (public 없어도 오류 안남)
    public abstract void takeOrder ();
}
