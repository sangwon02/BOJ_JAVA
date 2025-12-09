package boj3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 알맞은 체스말의 수
        int[] arr = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int found = Integer.parseInt(st.nextToken());
            // 알맞은 체스말의 수와 비교해 필요하거나 필요없는 말의 수를 저장
            sb.append(arr[i] - found).append(" ");
        }
        // 출력
        System.out.println(sb.toString().trim());
        br.close();
    }
}
