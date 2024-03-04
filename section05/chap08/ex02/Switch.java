package section05.chap08.ex02;

public class Switch extends FormElement {

    private boolean status;

    public Switch(int space, boolean status) {
        super(space);
        this.status = status;
    }

    @Override
    void func() {
        status = !status;
        System.out.println((status ? "ON" : "OFF") + "으로 전환");
    }
}