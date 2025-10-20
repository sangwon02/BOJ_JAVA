package boj10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] members = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken(); // 나이
            members[i][1] = st.nextToken(); // 이름
        }

        // 정렬 기준을 생성
        Arrays.sort(members, new Comparator<String[]>() {
            @Override
            public int compare(String[] m1, String[] m2) {
                // 나이만 숫자로 바꿔서 비교
                return Integer.parseInt(m1[0]) - Integer.parseInt(m2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");
        }
        System.out.print(sb.toString());

        br.close();
    }
}