package org.level0;

import java.util.HashMap;
import java.util.Map;

public class Multiply {

    public static void main(String[] args) {
        Multiply multiply = new Multiply();

        System.out.println(multiply.solution(100));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }

        return answer;
    }
}
