package org.example.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShake", 8.9, "베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        //스캐너 선언
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
           for (int i = 0; i<menuItems.size(); i++) {
               System.out.println((i+1) + "." + menuItems.get(i).name + "|w " + menuItems.get(i).price +"|" + menuItems.get(i).explanation);
           }
            System.out.println("0을 입력하면 종료");

            System.out.print("메뉴 숫자를 눌러주세요:");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("1. ShakeBurger |W 6.9|토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (num == 2) {
                System.out.println("2.SmokeShake |W 8.9|베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (num == 3) {
                System.out.println("3.Cheeseburger |W 6.9|포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (num == 4) {
                System.out.println("4. Hamburger |W 5.4|비프패티를 기반으로 야채가 들어간 기본버거");
            } else if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }else {
                System.out.println("잘못된 입력입니다");
            }

        }
      sc.close();
    }
}
