package boj25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int calculateTotal = 0; // 직접 계산할 총 금액

        // N개의 물건 가격과 개수를 입력받아 계산
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            calculateTotal += (price * count);
        }

        // 계산된 금액과 영수증 금액 비교
        if (calculateTotal == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }
}