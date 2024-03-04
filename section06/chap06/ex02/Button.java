package section06.chap06.ex02;
// ex01과 달리 Button 클래스 내부에 작성하여 오용 여지 제거하기 (버튼에 사용되는 속성들이므로…)
public class Button {

    // Button 클래스 내부에 enum 열거형 선언
    enum Mode { LIGHT, DARK }
    enum Space { SINGLE, DOUBLE, TRIPLE }

    private Mode mode = Mode.LIGHT;
    private Space space = Space.SINGLE;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}