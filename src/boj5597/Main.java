package boj5597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isSubmitted = new boolean[31];

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            li.add(num);
        }

        // 제출한 학생의 번호에 해당하는 칸을 true로 바꾼다.
        for (int num : li) {
            isSubmitted[num] = true;
        }

        // 답 출력
        for (int i = 1; i <= 30; i++) {
            if (isSubmitted[i] == false) {
                System.out.println(i);
            }
        }
    }
}