package section05.chap05.ex02;
// 메소드 오버라이딩 (오버로딩과 혼동하지 말 것)
// 부모가 가진 같은 이름의 메소드를 자식이 다르게 정의
// ***'저는 제 방식대로 하겠습니다.’*** (필요에 맞게 전수받은 메소드 내용을 바꾸는 것)
// 오버로딩: 같은 이름의 메소드를 인자가 다른 버전으로 만드는 것
// 오버라이딩: 부모와 자식 클래스의 메소드가 다른 것
public class Button {

    private String print;

    public Button(String print) {
        this.print = print;
    }
    public void func () {
        System.out.println(print + " 입력 적용");
    }
}
