package section05.chap08.ex02;
// FormElement는 인터페이스와 비슷한 느낌 (웹사이트의 버튼, 토글스위치)
public abstract class FormElement {

    protected int space;

    public FormElement(int space) {
        this.space = space;
    }

    abstract void func ();
}