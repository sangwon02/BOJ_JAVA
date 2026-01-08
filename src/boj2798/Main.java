package boj2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째줄 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 두번째줄 입력 받기
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[n];

        // 배열에 저장
        for (int i=0; i<n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int res = 0;

        // 모든 경우의 수 확인
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int currentsum = cards[i] + cards[j] + cards[k];

                    if (currentsum <= m && currentsum > res) {
                        res = currentsum;
                    }
                    // 만약 m이 된다면 출력 후 종류
                    if (currentsum == m) {
                        System.out.println(res);
                        br.close();
                        System.exit(0);
                    }

                }
            }
        }

        System.out.println(res);
        br.close();
    }
}