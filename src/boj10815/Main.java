package boj10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder(); //정답을 담을 변수

        HashSet<Integer> set = new HashSet<>();

        // n개의 숫자를 입력 받아 set에 저장
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // m개의 숫자를 입력 받아 set에 존재하는지 확인
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            //if와 contains로 유무 확인
            if (set.contains(num)){
                res.append("1 ");
            } else {
                res.append("0 ");
            }
        }

        System.out.println(res.toString());
        br.close();

    }
}
