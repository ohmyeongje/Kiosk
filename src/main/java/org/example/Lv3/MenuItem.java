package org.example.Lv3;

public class MenuItem{
    public String menuName;
    public String name; //이름
    public String price;  //가격
    public String explanation;  //설명

    //기본 생성자
    public MenuItem(String name, String price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
    }
