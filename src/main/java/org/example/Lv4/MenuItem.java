package org.example.Lv4;

public class MenuItem {
   private final String menuName;    //이름
   private final String price;       //가격
   private final String explanation; //설명

    public MenuItem(String menuName, String price, String explanation) {
        this.menuName = menuName;
        this.price = price;
        this.explanation = explanation;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return menuName + " | " + price + " | " + explanation;
    }
}

