package boj5597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 1; i < 31; i++) {
            li.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int score = Integer.parseInt(br.readLine());
            li.remove(Integer.valueOf(score));
        }

        System.out.println(li.get(0));
        System.out.println(li.get(1));

        br.close();
    }
}