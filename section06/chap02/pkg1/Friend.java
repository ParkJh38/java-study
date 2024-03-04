package section06.chap02.pkg1;

public class Friend {
    //  Parent와 같은 패키지
    Parent parent = new Parent();  // Parent의 인스턴스 생성

    //  int aa = new Parent().a; // ⚠️ 불가
    int bb = parent.b;
    // Child처럼 자식 클래스가 아니기 때문에. int bb = b; 이런 식으로는 못씀. 반드시 Parent의 인스턴스를 만들어서 위와 같이 사용
    int cc = parent.c; // 💡 protected - 같은 패키지, 비 상속관계
    int dd = parent.d;
}