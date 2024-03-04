package section05.chap02.ex01;
// 슬라임 클래스는 생성자를 필요로 하지 않음 (<-필드들이 기본 값을 가짐)
// 인스턴스를 인자로 받는 메소드

public class Slime {  // 클래스도 자료형이므로 어떤 변수나 인자로 활용될 수 있다
    double hp = 50;  // 필드들의 기본값을 클래스에 초기화할 수 있다는 점.
    int attack = 8;
    double defense = 0.2;

    void attack (Slime enemy) { // 💡다른 슬라임의 인스턴스를 인자로 받음
        enemy.hp -= attack * (1 - enemy.defense);
    }  // 여기서의 attack은 위에 이미 정해진 값 int attack = 8 값이다.
}