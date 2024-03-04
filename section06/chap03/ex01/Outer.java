package section06.chap03.ex01;
// 내부 클래스 (다른 클래스 안에 선언되는 클래스)
// 크게 4종류
// - 멤버 인스턴스 / 정적 내부 클래스 / 메소드 안에 정의된 클래스 / ⭐️익명 클래스
// 내부 클래스의 활용성
// - 보다 강력한 캡슐화 -> 외부/내부 클래스간의 관계가 긴밀할 때 사용
// - 적절히 사용시 유지보수가 용이하고 가독성을 높여줌 (과하게 사용되면 클래스 비대화)
public class Outer {  // Outer (바깥쪽 클래스)
    private String inst = "인스턴스";
    private static String sttc = "클래스";

    //  💡 1. 멤버 인스턴스 클래스
    class InnerInstMember {
        //  ⭐️ 외부 클래스의 필드(inst)와 클래스(InnerSttcMember) 접근 가능
        private String name = inst + " 필드로서의 클래스";
        private InnerSttcMember innerSttcMember = new InnerSttcMember();

        public void func () {
            System.out.println(name);
        }
    }

    //  💡 2. 정적(클래스) 내부 클래스
    //  ⭐️  내부 클래스에도 접근자 사용 가능. private으로 바꿔 볼 것
    public static class InnerSttcMember {
        //  ⭐️ 외부 클래스의 정적 클래스 필드(static class-)만 접근 가능
        private String name = sttc + " 필드로서의 클래스";
        // 외부 필드의 인스턴스도 접근 불가
//        private String name1 = sttc + inst + " 필드로서의 클래스";

        //  ⚠️ static이 아닌 멤버 인스턴스 클래스에도 접근 불가!
        //  private InnerInstMember innerInstMember = new InnerInstMember();

        public void func () {
            // ⚠️ 인스턴스 메소드지만 클래스가 정적(클래스의)이므로 인스턴스 필드 접근 불가
            //  name += inst;
            System.out.println(name);
        }
    }

    public void memberFunc () {
        //  💡 3. 메소드 안에 정의된 클래스 (메소드 안에서도 클래스를 선언해서 사용 가능하다. 💡but 보통 이렇게 사용하지는 않는다)
        //  스코프가 메소드 내로 제한됨
        class MethodMember {
            //  일반 메소드이므로 외부의 필드와 클래스에 모두 접근은 가능
            String instSttc = inst + " " + sttc;
            InnerInstMember innerInstMember = new InnerInstMember();
            InnerSttcMember innerSttcMember = new InnerSttcMember();

            public void func () {
                innerInstMember.func();
                innerSttcMember.func();
                System.out.println("메소드 안의 클래스");

                //  new Outer().memberFunc(); // ⚠️ 스택오버플로우 에러!! (재귀호출 무한호출 반복)
            }
        }

        new MethodMember().func();
    }

    public void innerFuncs () {  // Outer 클래스의 메소드
        new InnerInstMember().func();  // 멤버 인스턴스 클래스
        new InnerSttcMember().func();  // 정적 내부 클래스    모두 접근하여 호출 가능
    }

    public InnerInstMember getInnerInstMember () {
        return new InnerInstMember();
    }
}
