package boj11720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String numbers = sc.next();
        int res = 0;

        for (int i = 0; i < n; i++) {
            res += numbers.charAt(i) - '0';
        }

        System.out.println(res);
        sc.close();
    }
}