package section05.chap09.ex01;

public class Main {
    public static void main(String[] args) {

        //  ⭐ 다형성의 원칙이 인터페이스에도 적용
        PolarBear polarBear = new PolarBear();
        // 북극곰의 인스턴스는 부모 추상 클래스인 Mamal을 자료형으로 해서 mamal에 들어갈수도 있고
        // 인터페이스 Swimmer를 자료형으로 해서 swimmer에 들어갈수도 있다.
        Mamal mamal = polarBear;
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        Penguin penguin = new Penguin();

        Hunter[] hunters = {
                polarBear, glidingLizard, eagle, penguin
        };

        Flyer[] flyers = {
                flyingSquirrel, eagle, glidingLizard
        };

        //  💡⭐⭐ 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        for (Hunter hunter : hunters) {
            hunter.hunt();
        }

        for (Flyer flyer : flyers) {
            flyer.fly();
        }
    }
}
