package boj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] numA = new Integer[n];
        Integer[] numB = new Integer[n];

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numA[i] = Integer.parseInt(stA.nextToken());
            numB[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(numA);
        Arrays.sort(numB, Comparator.reverseOrder());

        Integer s = 0;
        for (int i = 0; i < n; i++) {
            s += numA[i] * numB[i];
        }

        System.out.println(s);

        br.close();
    }
}
