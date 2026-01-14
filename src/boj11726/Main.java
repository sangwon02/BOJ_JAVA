package boj11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        int n = Integer.parseInt(br.readLine());
        if (n==1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < n-1; i++) {
            list.add((list.get(i) + list.get(i-1))% 10007);
        }

        System.out.println(list.get(list.size()-1));

        br.close();


    }

}
