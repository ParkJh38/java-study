package section05.chap09.ex01;

public class Turtle extends Reptile implements Swimmer {

    @Override
    public void swim() {
        System.out.println("날개로 수영");
    }
}
