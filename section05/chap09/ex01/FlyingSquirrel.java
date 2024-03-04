package section05.chap09.ex01;

public class FlyingSquirrel extends Mamal implements Flyer {

    public FlyingSquirrel(){
        super(false);
    }

    @Override
    public void fly() {
        System.out.println("날다람쥐: 하강하면서 날개 펼치기");

    }
}
