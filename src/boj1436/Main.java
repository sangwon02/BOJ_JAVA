package boj1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 666;  // 영화 제목에 들어갈 숫자

        while (true) {
            // 만약 666을 포함하고 있으면
            if (String.valueOf(num).contains("666")) {
                cnt ++;  // cnt번째값 +1
            }

            if (cnt == n) { // 만약 n번째 값이라면
                break;  // while문 종료
            }

            num += 1;  //들어갈 숫자 +1
        }

        System.out.println(num);  //답출력

        br.close();
    }
}
