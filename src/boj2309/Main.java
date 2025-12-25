package boj2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarfs = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        // 가짜 난쟁이 2명 찾기
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (dwarfs[i] + dwarfs[j]) == 100) {
                    // 가짜 난쟁이를 찾으면 0으로 표시하여 제외함
                    dwarfs[i] = 0;
                    dwarfs[j] = 0;
                    found = true;
                    break;
                }
            }
            if (found) break; // 찾았으면 더 이상 반복 필요 없음
        }

        Arrays.sort(dwarfs);

        //  0이 아닌값들만 출력
        for (int i = 2; i < 9; i++) {
            System.out.println(dwarfs[i]);
        }

        br.close();
    }
}