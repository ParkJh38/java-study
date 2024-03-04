package section06.chap07.ex01;
// 레코드 (Java 16+)
// 데이터의 묶음을 저장하기 위한, 단순한 형태의 클래스 (C언어의 구조체 느낌)
public enum Gender {

    MALE("👦🏻"), FEMALE("👧🏼");

    private String emoji;
    Gender(String emoji) { this.emoji = emoji; }
    public String getEmoji() { return emoji; }
}