package section06.chap07.ex01;
// ⭐️  레코드로 작성
// 레코드 (Java 16+)
// 데이터의 묶음을 저장하기 위한, 단순한 형태의 클래스 (C언어의 구조체 느낌)

// ⭐️레코드는 final
// -다른 클래스로 상속되거나 abstract 로 선언 불가
// ⭐️레코드의 각 항목들은 private, final (private final 명시 안해줘도 됨)
// -각각 같은 이름의 getter가 기본으로 만들어짐
// 인스턴스 필드를 가질 수 없음 (매장마다의 필드는 갖지 못함)
// -클래스 필드는 가능 ( 아래 예제에서 확인 )
public record Child(

        String name,
        int birthYear,
        Gender gender
) {}