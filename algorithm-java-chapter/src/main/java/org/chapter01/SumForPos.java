package org.chapter01;

import java.util.Scanner;

// 양수 기준 n의 합 구하기
public class SumForPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합 구하기");

        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("수의 합 : " + sum);
    }
}
