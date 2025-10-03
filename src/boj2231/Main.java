package boj2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int number = 0;
        while (number < n) {
            number++;
            int number2 = number;
            int sumOfDigits = 0;
            while (number2 != 0) {
                sumOfDigits += number2 % 10; // 마지막 자릿수를 더하고
                number2 /= 10;   // 마지막 자릿수를 없앤다
            }
            if ((number+sumOfDigits)==n){
                System.out.println(number);
                br.close();
                System.exit(0);
            }
        }

        System.out.println(0);
        br.close();

    }
}
