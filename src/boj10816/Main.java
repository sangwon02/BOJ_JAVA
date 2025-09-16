package boj10816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();

        // 상근이가 가진 카드 N개 입력받음
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //맵에 카드 개수를 세어서 저장
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //확인할 카드 M개 입력받기
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // M개의 카드를 순회하며 맵에서 개수 찾기
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(target, 0) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}