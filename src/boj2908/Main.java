package boj2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String reverseda = new StringBuilder(a).reverse().toString();
        String reversedb = new StringBuilder(b).reverse().toString();

        int resa = Integer.parseInt(reverseda);
        int resb = Integer.parseInt(reversedb);

        System.out.print(resa > resb ? resa : resb);
        br.close();
    }
}
