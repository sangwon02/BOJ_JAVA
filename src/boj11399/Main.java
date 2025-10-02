package boj11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] times = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times);

        int totalTime = 0; // 모든 사람이 기다리는 시간
        int waitingTime = 0; // 각 사람이 기다려야 하는 시간

        // 정렬된 시간을 순회하며 총 시간을 계산
        for (int i = 0; i < n; i++) {
            // 현재 사람이 기다려야 하는 시간 = 이전 사람까지의 대기 시간 + 자신의 인출 시간
            waitingTime += times[i];
            // 총 대기 시간에 현재 사람의 대기 시간을 더한다
            totalTime += waitingTime;
        }

        System.out.println(totalTime);
        br.close();
    }
}