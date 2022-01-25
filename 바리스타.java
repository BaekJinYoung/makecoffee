package makecoffee;

public abstract class 바리스타 {
    abstract 커피 makeCoffee();

}

class 공유 extends 바리스타 {
    private String name = "공유";

    @Override
    커피 makeCoffee() { // 바리스타 책임
        커피 coffee = new 커피("아메리카노");
        return coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}