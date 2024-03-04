package section05.chap01.ex03;
// ⭐️ 생성자 메소드 - 매장을 내는 메소드
public class YalcoChicken {
    int no;
    String name;

    // 생성자: 해당 클래스가 반환값으로 되어있고, 메소드 이름이 따로 없는 메소드
    // 메서드 이름 없이, 반환 타입(해당 클래스) 뒤로 괄호가 따라옴
    // return을 명시하지 않음 - 자동으로 해당 클래스 타입의 인스턴스 반환
    // main에서 new 연산자와 함께 사용되어 인스턴스를 반환
    // 필수 작성 아님 - 언제나 같은 내용의 인스턴스를 반환할 경우 or 인자 없이 호출될 경우 (ex02)
    // 💡 생성자를 작성하지 않는다고 생성자가 없는 것이 아님
    // ex02 의 컴파일된 파일 YalcoChicken.class 살펴 볼 것 (out>section05.chap01.ex03.YalcoChicken.java)
    public YalcoChicken(int no, String name) {  //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
        this.no = no;  // this  - 만들어질 인스턴스를 가리킴 (this => instance 느낌)
        this.name = name; // this는 ex03 메인에서의 store1, 2, 3에 해당됨
    }
    //  ⭐ this : 생성될 인스턴스를 가리킴 (본사가 생성할 각 매장)


    String intro () {
        //  String name = "몽고반"; // 주석해제 시 name 대체
        return "안녕하세요, %d호 %s점입니다." // 🔴
                .formatted(no, name);
    }
}
