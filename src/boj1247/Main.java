package boj1247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 3; t++) {
            int N = Integer.parseInt(br.readLine());

            // 합계를 저장할 변수
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }

            // 합계의 부호 판별
            int compareResult = sum.compareTo(BigInteger.ZERO);

            if (compareResult == 0) {
                System.out.println("0");
            } else if (compareResult > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }

        br.close();
    }
}