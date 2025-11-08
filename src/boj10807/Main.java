package boj10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        // n개의 숫자를 한 줄로 입력받아 배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        int count = 0; // v의 개수를 셀 변수

        for (int num : numbers) {
            // 만약 현재 숫자가 v와 같다면
            if (num == v) {
                count++; // 개수를 1 증가
            }
        }

        System.out.println(count);
        br.close();
    }
}