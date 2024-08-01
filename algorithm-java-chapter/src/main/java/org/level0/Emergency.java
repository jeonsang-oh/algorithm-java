package org.level0;

import java.util.Arrays;

public class Emergency {

    public static void main(String[] args) {
        Emergency emergency = new Emergency();

        System.out.println(Arrays.toString(emergency.solution(new int[]{1,2,3,4,5})));
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
