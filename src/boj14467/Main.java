package boj14467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> cowMap = new HashMap<>(); // 소의 번호와 위치를 담을 맵
        int res = 0;  // 건너간 횟수를 담을 변수

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cowNum = st.nextToken();  // 입력 받은 소의 번호
            int cowLocation = Integer.parseInt(st.nextToken());  // 소의 위치

            if (cowMap.containsKey(cowNum)){  // 만약 확인하는 소의 번호의 위치를 알고 있었다면
                if (cowMap.get(cowNum)!=cowLocation){  // 소의 위치가 바꼈는지 확인
                    res += 1;  // 바뀐경우 건너간 횟수 +1
                    cowMap.put(cowNum,cowLocation);  // 위치 바꿔줌
                }
            }  else {  // 없는 경우
                cowMap.put(cowNum, cowLocation); // 맵에 넣어줌
            }

        }

        System.out.println(res);

        br.close();
    }
}
