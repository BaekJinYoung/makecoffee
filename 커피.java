package makecoffee;

//오브젝트 private
//오브젝트 상태 있다면 메서드 public
//오브젝트 초기화는 생성자로
//손님, 메뉴판, 메뉴아이템, 바리스타, 커피 오브젝트
//의존관계
public class 커피 extends MenuItem {
    private String name;
    private int prise;

    public 커피(String name) { // 디폴트 생성자 초기화
        this.setName(name);
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return "아메리카노";
    }

    public int getPrise(int prise) {
        return 1500;
    }

}