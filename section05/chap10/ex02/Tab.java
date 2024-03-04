package section05.chap10.ex02;

public class Tab {

    private Setting setting = null;  // 처음에 초기화 안함

    public Tab() {}

    //  ⭐️ 두 번째 생성자,
    public Tab(Setting setting) {
        this.setting = setting;
    }

    //  ⭐️ 세터
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }
}