package section06.chap04.ex02;
public interface OnClickListener {  // 인터페이스 (onClick 메소드 1개 보유)
    void onClick ();  // 사용자가 계산기 버튼을 클릭했을 때 실행이 되는 메소드
}
// 어떤 작업을 하는지는 여기서 명시하지 않음
// OnClickListener 인터페이스를 구현하는 클래스는 onClick 메소드에 대한 정의 필요