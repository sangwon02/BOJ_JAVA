package boj15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int m;
    public static int[] arr; // 수열을 저장할 배열
    public static boolean[] visited; // 방문 여부를 체크할 배열
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n + 1];

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

        //1부터 N까지의 수를 탐색
        for (int i = 1; i <= n; i++) {
            // 아직 방문하지 않은 숫자라면
            if (!visited[i]) {
                visited[i] = true;  //선택 (사용했다고 표시)
                arr[depth] = i;  // 현재 깊이에 해당 숫자를 저장
                backtrack(depth + 1); //탐색 (더 깊이 들어가기)
                visited[i] = false; //선택 취소 (원상 복구)
            }
        }
    }
}