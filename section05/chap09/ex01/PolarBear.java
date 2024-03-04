package section05.chap09.ex01;

public class PolarBear extends Mamal implements Hunter, Swimmer {
// 클래스 PolarBear는 Mamal에서 상속 받고, Hunter, Swimmer 인터페이스 적용
// PolarBear 클래스는 hunt, swim 메소드에 대한 구상이 되어야됨 (기능을 갖고 있어야 됨-> hunt 부분 지우면 오류뜸)
    // 바리스타 자격증이 있으면 라떼를 만들수 있어야 되는 것처럼, Hunter 인터페이스를 가지면, hunt 메소드를 기능해야됨
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + " 북극곰: 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}