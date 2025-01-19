package org.example.Lv3;

import org.example.Lv4.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //리스트를 선언해줍니다
    List<MenuItem> menuItems = new ArrayList<>();

    //필드를 선언해줍니다
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    MenuItem menuItem4;

    //기본 생성자를 생성해줍니다
    public Kiosk(MenuItem menuItem1, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4) {

    }



    public void Start() {
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShakeBurger |W 6.9|토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2.SmokeShake |W 8.9|베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3.Cheeseburger |W 6.9|포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger |W 5.4|비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("종료 하려면 0을 눌러주세요");
        System.out.println();

        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("메뉴번호를 눌러주세요:");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("메뉴명:" + menuItem1.name + "가격:" + menuItem1.price + "설명:" + menuItem1.explanation);
            } else if (num == 2) {
                System.out.println("메뉴명:" + menuItem2.name + "가격:" + menuItem2.price + "설명:" + menuItem2.explanation);
            } else if (num == 3) {
                System.out.println("메뉴명:" + menuItem3.name + "가격:" + menuItem3.price + "설명:" + menuItem3.explanation);
            } else if (num == 4) {
                System.out.println("메뉴명:" + menuItem4.name + "가격:" + menuItem4.price + "설명:" + menuItem4.explanation);
            } else if (num == 0) {
                System.out.println("프로그램을 종료 합니다");
                break;
            }else {
                System.out.println("잘 못 입력하셨습니다 다시 입력해주세요 ");
            }
        }
        sc.close();
    }



}
