package section05.chap09.ex01;

public class Eagle extends Bird implements Hunter, Flyer {

    @Override
    public void fly() {
        System.out.println("독수리: 날개로 비행");
    }

    @Override
    public void hunt() {
        System.out.println(position + " 독수리: 토끼 사냥");
    }
}
