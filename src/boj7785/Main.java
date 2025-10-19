package boj7785;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> company = new HashSet<>(); // 회사안에 있는 사람들을 담을 해쉬셋
        int n = Integer.parseInt(br.readLine()); // 기록된 출입 기록의 수 n

        for  (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) { // 만약 action이 enter면
                company.add(name);  // 회사에 넣음
            } else if (action.equals("leave")) { // leave면 회사에서 탈출
                company.remove(name);
            }
        }

        // 해쉬셋을 ArrayList로 변환
        ArrayList<String> sortedList = new ArrayList<>(company);

        // ArrayList를 사전 순의 역순으로 정렬
        Collections.sort(sortedList, Collections.reverseOrder());

        // 답 출력
        for(String name : sortedList) {
            System.out.println(name);
        }
        br.close();



    }
}
