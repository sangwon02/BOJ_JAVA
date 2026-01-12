package boj1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    // 문자열이 숫자인지 판별하는 함수
    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 포켓몬 이름과 번호를 담을 맵
        HashMap<String, Integer> nameToNum = new HashMap<>();
        // 번호와 이름을 담을 배열
        String[] numToName = new String[n + 1];

        // n개의 포켓몬을 두 자료구조에 모두 저장
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName[i] = name;
        }

        // 다음으로 m개의 문제를 푼다
        for (int i = 0; i < m; i++) {

            String question = br.readLine();// 일단 입력 받고
            // 숫자인지 문자인지 판별
            if (isNumeric(question)) { // 숫자인 경우
                int num = Integer.parseInt(question);  // 정수형 변수로 바꿔주고
                System.out.println(numToName[num]);  // 배열에서 이름 찾기
            } else { // 문자인 경우
                System.out.println(nameToNum.get(question));  // 맵에서 번호 찾기
            }
        }

        br.close();
    }


}