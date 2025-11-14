package boj2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] notes = new int[8];
        for (int i = 0; i < 8; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";

        if (notes[0] == 1) {
            result = "ascending";
            for (int i = 1; i < 8; i++) {
                if (notes[i] != i + 1) {
                    result = "mixed";
                    break;
                }
            }
        }
        else if (notes[0] == 8) {
            result = "descending";
            // 인덱스 확인
            for (int i = 1; i < 8; i++) {
                // 현재 숫자와 같지 않다면
                if (notes[i] != 8 - i) {
                    result = "mixed";
                    break; // 규칙이 깨졌으므로 중단
                }
            }
        }
        // 1이나 8로 시작하지 않으면 무조건 mixed
        else {
            result = "mixed";
        }

        System.out.println(result);
    }
}