package boj2596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] code = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
        String[] a = {"A", "B", "C", "D", "E", "F", "G", "H"};

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();


        // 암호 담을 변수
        StringBuilder sb = new StringBuilder();

        // 암호 찾기
        for (int i = 0; i < n; i++) {
            // 6개씩 나눔
            String st = input.substring(i*6, (i+1)*6);
            // 문자가 맞는지 확인할 변수
            boolean found = false;

            // 알파벳에 해당하는지 확인
            for (int j = 0; j < 8; j++) {
                // 숫자 몇개 다른지 확인
                int cnt = 0;
                for (int k = 0; k < 6; k++) {
                    // 비교하는데 만약 다른 숫자가 있으면
                    if (st.charAt(k) != code[j].charAt(k)) {
                        cnt += 1;
                    }
                }

                // 만약 1개 이하로 다르다면
                if (cnt <= 1) {
                    sb.append(a[j]);
                    found = true; // 해당하는 알파벳 찾음
                    break; //for문 종료
                }
            }
            //  만약 찾지 못했다면
            if (!found) {
                System.out.println(1+i);
                br.close();
                System.exit(0); // 종료
            }
        }

        // 모든암호 해독하면 출력
        System.out.println(sb.toString());
        br.close();

    }
}