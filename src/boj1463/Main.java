package boj1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        // 초기값 설정
        list.add(0);
        list.add(0); // 1은 이미 1이므로 연산 횟수 0

        for (int i = 2; i <= n; i++) {
            //  1을 뺀다: (i-1)을 만드는 횟수 + 1번
            int min = list.get(i - 1) + 1;

            // 2로 나누어 떨어지면 (i/2)를 만드는 횟수 + 1번과 비교
            if (i % 2 == 0) {
                int temp = list.get(i / 2) + 1;
                if (temp < min) {
                    min = temp;
                }
            }

            // 3으로 나누어 떨어지면 (i/3)을 만드는 횟수 + 1번과 비교
            if (i % 3 == 0) {
                int temp = list.get(i / 3) + 1;
                if (temp < min) {
                    min = temp;
                }
            }

            list.add(min);
        }

        System.out.println(list.get(n));

        br.close();
    }
}