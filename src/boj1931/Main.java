package boj1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //n개의 회의 정보를 저장할 2차원 배열 생성
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        //Comparator를 사용해서 정렬
        Arrays.sort(meetings, (m1, m2) -> {
            // 종료 시간을 오름차순으로 정렬
            if (m1[1] == m2[1]) {
                // 종료 시간이 같다면, 두 번째 기준인 시작 시간을 오름차순으로 정렬
                return m1[0] - m2[0];
            } else {
                return m1[1] - m2[1];
            }
        });

        int cnt = 0; // 선택한 회의의 수
        int lastEndTime = 0; // 마지막으로 끝난 회의의 종료 시간

        // 정렬된 회의 목록을 순회하며 그리디 선택
        for (int i = 0; i < n; i++) {
            if (meetings[i][0] >= lastEndTime) {
                // 현재 회의를 선택
                cnt++;
                // 마지막으로 끝난 시간을 현재 회의의 종료 시간으로 갱신
                lastEndTime = meetings[i][1];
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
