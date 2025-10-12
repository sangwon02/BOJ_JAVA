package boj15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n; // 1부터 N까지의 자연수
    public static int m; // M개를 고른 수열의 길이
    public static int[] arr; // 수열을 저장할 배열
    public static StringBuilder sb = new StringBuilder(); // 출력을 위한 StringBuilder

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        // 백트래킹 함수 시작 (깊이 0부터)
        backtrack(0);

        System.out.println(sb); // 최종 결과 출력
        br.close();
    }

    public static void backtrack(int depth) {
        // 종료 조건: 수열이 M개가 되면 출력하고 종료
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 1부터 N까지의 수를 탐색
        for (int i = 1; i <= n; i++) {
            // visited 배열이 없으므로, 모든 숫자를 제약 없이 선택할 수 있음 (중복 허용)

            // 선택: 현재 깊이(depth)에 i를 저장
            arr[depth] = i;
            // 탐색: 다음 깊이(depth + 1)로 들어가기
            backtrack(depth + 1);
            // 선택 취소 과정이 필요 없음
            // (visited를 사용하지 않으므로 원상복구할 필요가 없고,
            // for문의 다음 반복에서 arr[depth]의 값이 덮어쓰여지기 때문)
        }
    }
}