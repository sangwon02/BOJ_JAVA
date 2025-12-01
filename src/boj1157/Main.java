package boj1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어를 입력받고 모두 대문자로 변환한다
        String input = br.readLine().toUpperCase();

        // 알파벳 A~Z의 개수를 저장할 배열
        int[] count = new int[26];

        // 문자열을 순회하며 각 알파벳의 개수를 센다.
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // 'A'를 0번 인덱스로 만들기 위해 'A'를 빼준다
            count[c - 'A']++;
        }

        int maxCount = -1;
        char maxChar = '?';

        // 가장 많이 나온 알파벳을 찾는다
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                // 인덱스 i를 다시 문자로 변환
                maxChar = (char) (i + 'A');
            } else if (count[i] == maxCount) {
                // 최댓값이 중복되면 ?로 설정
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
        br.close();
    }
}