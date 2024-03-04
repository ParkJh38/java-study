package section05.chap04.ex03;
// Getter와 Setter
// Button 값이 반환되거나 수정될때 getter 와 setter로 지정할 수 있다
public class Product {

    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }

    public int getPrice() {
        return (int) (price * (1 - discount));
    }

    public void setPrice(int price) {
        //  ⭐ this 사용 주의
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}