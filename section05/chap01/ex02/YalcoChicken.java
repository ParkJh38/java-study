package section05.chap01.ex02;
// 💡 클래스 & 인스턴스 - 프랜차이즈 본사 & 매장
//  본사의 코드
public class YalcoChicken {
    //  인스턴스가 가질 필드들(field: 각 매장이 갖고 있는 정보)
    int no;  // 몇 호점
    String name;  // 지점 이름

    //  인스턴스가 가질 메소드 - 💡 static을 붙이지 않음
    String intro () {
        // no와 name 앞에 this를 붙인 것과 같음
        return "안녕하세요, 얄코치킨 %d호 %s점입니다."
                .formatted(no, name);
    }
}