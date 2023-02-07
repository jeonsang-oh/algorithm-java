package org.chapter01;

import java.util.Scanner;

public class GaussSum {

    public static int sum(int n) {
        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값 : ");
        int num = sc.nextInt();

        System.out.print(sum(num));
    }
}
