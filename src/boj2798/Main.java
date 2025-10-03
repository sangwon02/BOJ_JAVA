package boj2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 답을 담을 변수
        int res = 0;

        // 3중 for문으로 3개의 카드를 뽑는 모든 조합을 만든다
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = cards[i] + cards[j] + cards[k];

                    // 현재 합이 m을 넘지 않으면서, 이전에 찾은 합보다 더 크다면
                    if (currentSum <= m && currentSum > res) {
                        res = currentSum;
                    }
                }
            }
        }
        System.out.println(res);
        br.close();

    }
}
