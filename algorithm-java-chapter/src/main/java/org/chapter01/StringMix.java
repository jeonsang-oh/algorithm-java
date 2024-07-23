package org.chapter01;


// 문제 설명
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
// 입출력 예
//  str1	str2	result
// "aaaaa"	"bbbbb"	"ababababab"
public class StringMix {

    public static void main(String[] args) {
        String str = solution("aaaa", "bbbbbb");
        System.out.print(str);
    }

    public static String solution(String str1, String str2){
        String answer = "";
        int size = 0;
        // str1, str2 중 문자열이 더 긴값을 size로 할당
        if (str1.length() > str2.length()) {
            size = str1.length();
        } else {
            size = str2.length();
        }

        // 두 문자열의 길이가 다를 경우 따로 치환 처리 해주지 않으면 오류 발생하여 3항연산 처리 (문자열 총길이 보다 i가 더큰경우)
        for (int i = 0; i < size; i++) {
            String s1 = i >= str1.length() ? "" : String.valueOf(str1.charAt(i));
            String s2 = i >= str2.length() ? "" : String.valueOf(str2.charAt(i));

            answer = answer + s1 + s2;
        }

        return answer;
    }
}

