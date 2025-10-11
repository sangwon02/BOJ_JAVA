package boj15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int m;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        // 탐색을 1번 학생부터 시작
        backtrack(1, 0);

        System.out.println(sb);
        br.close();
    }

    // start: 탐색을 시작할 숫자, depth: 현재 채워진 자리 수
    public static void backtrack(int start, int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // for문이 1이 아닌 start부터
        for (int i = start; i <= n; i++) {
            arr[depth] = i; // 현재 학생을 자리에 세움
            backtrack(i + 1, depth + 1);
        }
    }
}