package section05.chap02.ex03;
// 얄코치킨과 치킨메뉴 클래스
// 클래스의 필드로 다른 클래스의 인스턴스를 담은 배열을 가짐 (클래스의 인스턴스가 배열 등 다른 자료형에도, 그 반대로도 포함될 수 있음)
public class YalcoChicken {
    int no;
    String name;
    ChickenMenu[] menus;

    YalcoChicken (int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu (String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) { // 🔴
                return menu;
            }
        }
        return null;
    }
}
