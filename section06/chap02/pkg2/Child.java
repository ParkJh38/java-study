package section06.chap02.pkg2;
// Parent 와는 다른 패키지에 있는 Child 클래스
// 상단에 임포트 필요
import section06.chap02.pkg1.Parent;

public class Child extends Parent {
    //  Parent 와 다른 패키지
    //  int aa = a;  // ⚠️ 불가
    //  int bb = b;  // ⚠️ 불가 (default 여도, 다른 패키지에서는 사용 불가)
    int cc = c;  // 💡💡💡 protected - 다른 패키지에 있어도 상속관계이면 사용 가능
    int dd = d;  // public은 어디서든 접근 가능
}