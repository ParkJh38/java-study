package section06.chap06.ex03;
// enum의 추가 기능들
// 💡💡enum도 클래스처럼 필드, 생성자, 메소드를 가질 수 있음
public enum YalcoChickenMenu {

    FR("후라이드", 10000, 0),
    YN("양념치킨", 12000, 1),
    GJ("간장치킨", 12000, 0),
    RS("로제치킨", 14000, 0),
    PP("땡초치킨", 13000, 2),
    XX("폭렬치킨", 13000, 3);

    // enum 에서 사용할 필드값
    private String name;
    private int price;
    private int spicyLevel;

    // 각 필드값들이 어떻게 들어갈지 결정하는 생성자
    YalcoChickenMenu(String name, int price, int spicyLevel) {
        this.name = name;
        this.price = price;
        this.spicyLevel = spicyLevel;
    }

    // 클래스처럼 enum 도 메소드를 보유 가능
    // getter, setter
    public String getName() { return name; }
    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc () {  //get Description
        String peppers = "";
        if (spicyLevel > 0) {
            peppers = "🌶️".repeat(spicyLevel);
        }

        return "%s %s원 %s"
                .formatted(name, price, peppers);
    }
}
