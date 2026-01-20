package boj15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] output;
    public static int n, m;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void perm(int cnt) {
        // [종료 조건] m개를 모두 뽑았으면 출력하고 종료
        if (cnt == m) {
            for (int val : output) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            // 이미 사용한 숫자라면 건너뜀
            if (visited[i]) continue;

            // [선택] i번째 숫자를 선택
            output[cnt] = i;      // 결과 배열에 저장
            visited[i] = true;    // 사용했다고 표시

            // [탐색] 다음 숫자를 뽑으러 감 (재귀 호출)
            perm(cnt + 1);

            // [선택 취소] 탐색이 끝나고 돌아오면, 다음 경우를 위해 사용 표시 해제
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        output = new int[m];
        visited = new boolean[n + 1];

        perm(0);

        System.out.print(sb);
    }
}