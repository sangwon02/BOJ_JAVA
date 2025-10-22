package boj1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static  void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] digists = String.valueOf(n).toCharArray(); // 숫자를 배열로 변환

        Arrays.sort(digists); // char 배열을 오름차순으로 정렬

        String sortedAsc = new String(digists);  // String으로 변경
        String sortedDesc = new StringBuilder(sortedAsc).reverse().toString(); // 역순으로 해 저장

        System.out.print(sortedDesc); // 답 출력

        br.close();
    }
}
