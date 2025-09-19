package boj11866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer((br.readLine()));
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 큐 생성 후 번호 입력
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.offer(i);
        }

        // 답을 만들 문자열 생성
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 큐에 사람이 한명 남을때까지 반복
        while (queue.size() > 1) {
            for (int i = 0; i < k-1; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        // 마지막 사람 넣어줌
        sb.append(queue.poll()).append(">");
        // 답 출력
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();


    }
}
