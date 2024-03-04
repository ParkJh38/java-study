package section06.chap03.ex02;

public class YalcoChicken {

    private String name;
    public YalcoChicken (String name) {
        this.name = name;
    }

    //  매장신설 TF팀 - 본사에서 새로운 지점을 생성할때 본사에서 임시로 창설 (새로운 매장을 내기 위한 클래스)
    public static class LaunchTF {
        private String title;
        private String leader;

        public LaunchTF(String title, String leader) {
            this.title = title;
            this.leader = leader;
        }

        public YalcoChicken launch () {
            //  ⚠️ 인스턴스 필드는 사용 불가
            //  System.out.println(this.name);
            return new YalcoChicken(title);
        }
    }

    //  매장마다의 기프트 - 매장에서 배부
    class Gift {
        private String message;

        public Gift(String to) {
            this.message = "From 얄코치킨 %s점 to %s님"
                    .formatted(name, to);
        }
    }

    public Gift getGift (String to) {  // ⭐⭐내부 클래스 Gift는 static이 아니기 때문에 Gift의 인스턴스를 반환하는 메소드를 외부 클래스 안에 만들어주어야 됨
        return new Gift(to);
    }
}
