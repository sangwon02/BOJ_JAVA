package boj2562;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];

        // 정수 입력 받아 nums 배열에 저장
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int max = nums[0]; // 최댓값 일단 0번째
        int maxindex = 0; // 최댓값의 인덱스 값 일단 0

        for (int i = 1; i < 9; i++) {
            if (nums[i] > max) {  // 만약 더 큰 값이 나오면
                max = nums[i];  // 교체
                maxindex = i;
            }

        }

        System.out.println(max); // 최댓값
        System.out.println(maxindex+1); //최댓값의 인덱스 값 + 1

        br.close();
    }
}
