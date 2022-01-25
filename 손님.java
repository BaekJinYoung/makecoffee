package makecoffee;

public abstract class 손님 {
    abstract void order(바리스타 barista, 메뉴판 menu);
}

class 홍길동 extends 손님 {
    private String name = "홍길동";

    public 홍길동(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void order(바리스타 barista, 메뉴판 menu) { // 손님 책임
        String menuchoose = menu.choose("아메리카노");
        커피 coffee = barista.makeCoffee();
        System.out.println(getName() + "이" + coffee.getPrise(1500) + "원" + menu.choose("아메리카노") + "를 받았습니다.");
    }

}