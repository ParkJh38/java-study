package section05.chap07;
// 클래스의 Final
public class YalcoChicken {

    // ⭐️⭐️필드들에 final이 수식이 된 경우
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";
    private final int no;  // no가 final인데 초기화 안해줌 -> 아래 생성자에서는 no 초기화 꼭 해주어야 됨
    public String name;


    public YalcoChicken(int no, String name) {
        this.no = no;  //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
        this.name = name;
    }

    // ⚠️ 불가
//    public void changeFinalFields () {
//        this.no++;  // no 역시 final 수식이므로 수정 불가
//    }

    public final void fryChicken () {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
