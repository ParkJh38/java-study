package section05.chap02.ex01;

public class Main {
    public static void main(String[] args) {

        Slime slime1 = new Slime();  // 생성자가 따로 지정되어 있지 않을 경우에는 클래스 이름 옆에 ( ) 붙여주면 됨
        Slime slime2 = new Slime();

        slime1.attack(slime2);
    }  // 💡클래스도 참조 자료형 -> slime1의 메소드 안에서 slime2의 값을 받아와서 값을 바꿨지만, 실제 slime2에 반영이 되었다는 점에서
}      // 참조형은 slime2의 주소값을 복사해주는 것이기 때문에 그것의 hp값을 바꿔주면 실제 slime2 인스턴스의 hp값도 바뀌게 된 것
// slime1, slime2는 같은 클래스의 인스턴스지만, 필드의 값은 각기 별개임