package org.greedy;

import java.util.Scanner;

public class SplitChange {
// 백준 2720 세탁소 사장 동혁
// 거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.
// 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
// 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 개수: ");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.print("테스트 케이스: ");
            int C = sc.nextInt();

            // 몫 계산
            int quarter = C / 25;
            // 나머지 계산
            C %= 25;

            int dime = C / 10;
            C %= 10;

            int nickel = C / 5;
            C %= 5;

            int penny = C;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

        sc.close();

    }

}
