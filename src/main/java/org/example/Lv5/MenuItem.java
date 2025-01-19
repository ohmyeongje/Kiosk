package org.example.Lv5;

public class MenuItem {
    String menuName;    //이름
    String price;       //가격
    String explanation; //설명

    public MenuItem(String menuName, String price, String explanation) {
        this.menuName = menuName;
        this.price = price;
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return menuName + " | " + price + " | " + explanation;
    }
}

