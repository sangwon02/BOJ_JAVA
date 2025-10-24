package boj2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException { // Exception -> IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // ArrayList 생성
        ArrayList<Integer> numsList = new ArrayList<>();

        // n개의 숫자를 저장
        for (int i = 0; i < n; i++) {
            numsList.add(Integer.parseInt(br.readLine()));
        }

        // Collections.sort()로 정렬
        Collections.sort(numsList);

        StringBuilder sb = new StringBuilder();

        for (int num : numsList) {
            sb.append(num).append('\n');
        }

        System.out.print(sb.toString());


        br.close();
    }
}