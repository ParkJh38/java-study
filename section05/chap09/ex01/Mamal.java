package section05.chap09.ex01;
// 클래스와 추상클래스와 관계는 족보처럼 물려 받는 것의 느낌이면,
// 인터페이스는 자격증의 느낌. 장착하는 것. 자격증은 여럿 딸수 있음
// (북극곰은 사냥, 수영이 가능하고, 사냥이라는 인터페이스는 한 계열에 종속된 것이 아닌, 파충류에서도 가능한 것)
// 상속관계에 대한 제한 없음
// 메소드는 추상 메소드 (abstract 안 붙여도 됨), 필드 값에는 상수만 가능(final 명시 불필요)
// 적용 연산자는 추상클래스는 extends 이지만, 인터페이스는 implements
public abstract class Mamal {

    public boolean hibernation;

    public Mamal(boolean hibernation) {
        this.hibernation = hibernation;
    }
}