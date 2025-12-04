package boj3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();

        // 10번 반복하며 숫자를 입력받음
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            // 42로 나눈 나머지를 HashSet에 저장
            set.add(num % 42);
        }

        System.out.println(set.size());

        br.close();
    }
}