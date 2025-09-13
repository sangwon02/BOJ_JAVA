package boj2164;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        // 1번부터 N번까지의 카드를 순서대로 큐에 삽입
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 큐에 카드가 한 장 남을 때까지 반복
        while (queue.size() > 1) {
            // 맨 위의 카드를 한 장 버림
            queue.poll();
            // 그 다음 맨 위의 카드를 뽑아서 맨 아래로 옮김
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());

        br.close();
    }
}