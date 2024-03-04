package section05.chap07;

// 클래스 자체에 final 수식이 붙을 경우. 이 클래스의 자식 클래스를 생성할 수 없다.
public  final class YalcoChickenDT extends YalcoChicken {

    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가 (부모 클래스의 메소드에 final 수식이 되어있음 -> 수정 불가. 그대로 써라.)
//    public void fryChicken () {  // 부모클래스의 fryChicken 메소드 오버라이딩 시도
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것
}