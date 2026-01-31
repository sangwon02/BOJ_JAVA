package boj10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int pactorial(int n) {
        if (n <= 1) return 1;
        return pactorial(n-1)*n;
    }

    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(pactorial(n));
        br.close();
    }
}
