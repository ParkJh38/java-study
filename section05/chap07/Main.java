package section05.chap07;

public class Main {
    public static void main(String[] args) {

        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 (Final로 수식이 된 필드는 수정 불가)

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

//        store1 = new YalcoChicken(17, "강남");  //  ⚠️ 불가 (이미 바로 위에서 store1 final로 수식함)

        //  💡 하지만 요소 변경은 가능 (public이므로 가능) (집문서는 final이라 못바꾸지만, 인테리어는 바꿀 수 있다)
        store1.name = "선릉";
    }
}

// ⭐정리️
// 💡final 필드
//  1.값 변경 불가
//  2.필드 선언시 또는 생성자에서 초기화해야 함 (수정이 불가하므로… 값을 지정해 주고 수정 못하게)

// 💡final 메서드
//  1.자식 클래스에서 오버라이드 불가

// 💡final 인스턴스
//  1.다른 값을 넣는 것은 불가
//  2.필드는 변경 가능 (주소는 바꾸지 못하지만 인테리어는 바꿀 수 있음)

// 💡final 클래스
//  1.하위 확장 불가 (자식 클래스를 만들 수 없음)