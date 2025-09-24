package boj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //HashSet을 사용
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 정렬을 위해 HashSet을 String 배열로 변환
        String[] words = set.toArray(new String[0]);

        // Comparator를 사용해서 정렬 기준 생성
        Arrays.sort(words, (s1, s2) -> {
            // 길이를 비교
            if (s1.length() == s2.length()) {
                // 길이가 같다면 두 번째 기준인 사전 순서로 비교
                return s1.compareTo(s2);
            } else {
                // 길이가 다르다면, 길이 기준으로 오름차순 정렬
                return s1.length() - s2.length();
            }
        });

        // 정렬된 결과를 StringBuilder에 담아 출력
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append('\n');
        }
        System.out.print(sb);

        br.close();
    }
}