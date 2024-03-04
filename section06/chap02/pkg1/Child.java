package section06.chap02.pkg1;

public class Child extends Parent {
    //  Parent와 같은 패키지
    //  int aa = a; // ⚠️ 불가 (Parent 클래스에서 private라서. but 상속을 못 받는다는 것이 아님. 자식이 물려받아 갖고만 있을 뿐, 손 대지를 못한다는 뜻)
    int bb = b;
    int cc = c; // 💡 protected - 같은 패키지, 상속관계
    int dd = d;
}
