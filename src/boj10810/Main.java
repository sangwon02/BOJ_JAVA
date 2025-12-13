package boj10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 1; i <= m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st2.nextToken());
            int num2 = Integer.parseInt(st2.nextToken());
            int num3 = Integer.parseInt(st2.nextToken());

            // num1부터 num2까지 num3값을 넣는다.
            // (원래있던 공을 빼라고 하는데 이는 그냥 원래 있던 값 변경이라 신경쓸 필요없음)
            for (int j = num1-1; j < num2; j++) {
                arr[j] = num3;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int ball : arr) {
            sb.append(ball).append(" ");
        }

        System.out.println(sb);

        br.close();

    }
}
