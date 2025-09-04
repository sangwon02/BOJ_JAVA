package boj2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 최댓값을 저장할 변수
        int max = 0;
        // 최댓값의 위치를 저장할 변수
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 1; i <= 9; i++) { // 1행부터 9행
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) { // 1열부터 9열
                int num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);

        br.close();
    }
}