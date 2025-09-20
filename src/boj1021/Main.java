package boj1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();

        // 덱에 1부터 n까지 숫자 집어 넣음
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        // 뽑아내려는 숫자들을 배열에 저장
        int[] targets = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            int target = targets[i];

            //타겟 숫자의 현재 위치(인덱스)를 찾는다.
            int targetIndex = deque.indexOf(target);
            int halfIndex;

            if (deque.size() % 2 == 0) {
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }

            // 중간보다 앞쪽에 있으면 왼쪽으로 회전
            if (targetIndex <= halfIndex) {
                for (int j = 0; j < targetIndex; j++) {
                    deque.offerLast(deque.pollFirst());
                    cnt++;
                }
            }
            // 중간보다 뒤쪽에 있으면 오른쪽으로 회전
            else {
                for (int j = 0; j < deque.size() - targetIndex; j++) {
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            }
            //목표 숫자를 뽑아낸다
            deque.pollFirst();
        }

        System.out.println(cnt);
        br.close();


    }
}
