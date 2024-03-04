package section06.chap02.pkg4;

import section06.chap02.pkg1.Parent;
import section06.chap02.pkg3.*; // ⭐️ 와일드카드 (해당 패키지에 있는 모든 클래스를 가져옴)

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우 (pkg1에 있는 Child 클래스, pkg2에 있는 Child 클래스)
        section06.chap02.pkg1.Child child1 = new section06.chap02.pkg1.Child();  // 실제 경로를 모두 작성
        section06.chap02.pkg2.Child child2 = new section06.chap02.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}