package section06.chap02.pkg1;
// 패키지 -> 자바 프로젝트의 디렉토리(폴더)를 패키지라고 부름. 패키지를 호출할때 디렉토리 경로를 정확히 명시해주어야 오류 안남
// - 일정 규모 이상의 프로그램을 적절히 모듈화
// - 패키지 정보: 클래스의 구성요소 중 하나
// 사용 목적: 클래스명의 중복을 피하기 위해 사용
// 빌드의 결과도 패키지의 구조를 따름
public class Parent {

    private int a = 1;
    int b = 2;  // default 이므로 같은 패키지 내에서는 모두 사용 가능
    protected int c = 3;
    public int d = 4;
}
