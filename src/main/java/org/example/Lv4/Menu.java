package org.example.Lv4;

import java.util.ArrayList;
import java.util.List;

public class  Menu {
    private final List<MenuItem> items = new ArrayList<>();
    private final String categoryName;    //상위 카테고리 이름

    public Menu(String categoryName) {
        this.categoryName = categoryName;
    }

    //카테고리명 반환 메서드
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void showMenuItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " + items.get(i).getMenuName() + " | " + items.get(i).getPrice() + " | " + items.get(i).getExplanation());
        }
        System.out.println("0. 뒤로 가기");
    }
}