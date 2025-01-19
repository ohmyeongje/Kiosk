package org.example.Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String menu = scanner.next();
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShakeBurger |W 6.9|토마토, 양상추, 쉑소스가 토핑된 치즈버거");

            System.out.println("2.SmokeShake |W 8.9|베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");

            System.out.println("3.Cheeseburger |W 6.9|포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");

            System.out.println("4. Hamburger |W 5.4|비프패티를 기반으로 야채가 들어간 기본버거");

            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }
    }
}
