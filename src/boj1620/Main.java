package boj1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 이름
        HashMap<String, Integer> nameToNumMap = new HashMap<>();
        // 번호
        String[] numToNameArr = new String[N + 1];

        // N개의 포켓몬을 두 자료구조에 모두 저장
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNumMap.put(name, i);
            numToNameArr[i] = name;
        }

        // M개의 문제를 푼다
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            // 숫자인지 문자인지 판별
            if (isNumeric(question)) { // 숫자인 경우
                int num = Integer.parseInt(question);
                sb.append(numToNameArr[num]).append("\n"); // 배열에서 이름 찾기
            } else { // 문자인 경우
                sb.append(nameToNumMap.get(question)).append("\n"); // 맵에서 번호 찾기
            }
        }

        System.out.print(sb.toString());
        br.close();
    }

    // 문자열이 숫자인지 판별하는 보조 메서드
    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}