package org.level0;

import java.util.Arrays;

public class emergency {

    public static void main(String[] args) {
        emergency multiply = new emergency();

        System.out.println(Arrays.toString(multiply.solution(new int[]{1,2,3,4,5})));
    }

    public int[] solution(int[] emergency) {
        int size = emergency.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (emergency[i] <= emergency[j]) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}
