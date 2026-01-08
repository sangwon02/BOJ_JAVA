package boj2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 0;

        while (n > num) {
            num += 1;
            int num2 = num;
            int sum = 0;

            while (num2 != 0) {
                sum += num2%10;
                num2 /=10;
            }

            if ((sum+num)==n){
                System.out.println(num);
                br.close();
                System.exit(0);
            }
        }

        System.out.println(0);

        br.close();
    }
}
