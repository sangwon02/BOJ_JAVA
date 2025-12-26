package boj2566;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0; // 최댓값, -1로 시작
        int row = 0;  // 최댓값의 행
        int col = 0;  // 최댓값의 열

        // 9행 반복
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 9열 반복
            for (int j = 1; j <= 9; j++) {

                int num = Integer.parseInt(st.nextToken());

                // 현재 값이 최댓값보다 크면 갱신
                if (num > max) {

                    max = num;
                    row = i; // 행 저장
                    col = j; // 열 저장
                }
            }
        }

        System.out.println(max);

        System.out.println(row + " " + col);

        br.close();
    }
}