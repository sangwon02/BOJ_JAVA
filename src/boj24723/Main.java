package boj24723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= 2;
        }

        System.out.println(res);

        br.close();
    }
}
