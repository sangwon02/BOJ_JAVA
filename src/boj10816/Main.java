package boj10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> nCard = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int card = Integer.parseInt(st.nextToken());
            nCard.put(card, nCard.getOrDefault(card, 0) + 1);
        }


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= m; i++) {
            int card = Integer.parseInt(st.nextToken());
            if (nCard.containsKey(card)) {
                sb.append(nCard.get(card)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

        br.close();

    }
}
