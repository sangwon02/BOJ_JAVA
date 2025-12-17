package boj10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
        String line = br.readLine();
        // 입력이 없거나 비정상적인 경우 종료 (안전장치)
        if (line == null) break;

        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == 0 && b == 0) {
        break;}
        System.out.println((a+b));
    }

    br.close();
    }
}