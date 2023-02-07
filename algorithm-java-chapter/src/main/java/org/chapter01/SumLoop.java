package org.chapter01;

import java.util.Scanner;

public class SumLoop {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("입력값 : ");
            int num = sc.nextInt();

            System.out.print(sum(num));
    }
}
