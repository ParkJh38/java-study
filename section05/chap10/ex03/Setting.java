package section05.chap10.ex03;
// 싱글턴 (객체지향 기능을 가진 프로그래밍 언어들에서 공통적으로 쓸 수 있는 객체지향 패턴 방식)
// ***프로그램 상에서 특정 인스턴스가 딱 하나만 있어야 할 때
// 🏪 본사직영매장 하나만 운영하는 회사
// 프로그램상 여러 곳에서 공유되는 설정
// 멀티쓰레딩 환경에서 공유되는 리소스
// 기타 전역으로 공유되는 인스턴스가 필요한 경우

public class Setting {
    //  ⭐️ 이 클래스를 싱글턴으로 만들기

    // 클래스(정적) 필드
    // - 프로그램에서 메모리에 ⭐️단 하나만 존재
    private static Setting setting;

    //  ⭐️⭐️⭐️ 생성자를 private으로!
    // - 본사 밖 외부에서 접근하지 못하도록
    private Setting () {}

    //  💡 공유되는 인스턴스를 받아가는 public 클래스 메소드
    public static Setting getInstance() {
        //  ⭐️ 아직 인스턴스가 만들어지지 않았다면 생성
        //  - 프로그램에서 처음 호출시 실행됨
        if (setting == null) {
            setting = new Setting();
        }
        return setting;
    }

    private int volume = 5;

    public int getVolume() {
        return volume;
    }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}
