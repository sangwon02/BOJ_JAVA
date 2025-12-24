package boj2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        int sum = 0;

        // 5개의 숫자를 입력받아 배열에 저장하고 합계를 구하기
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        // 중앙값을 찾기 위해 배열을 정렬
        Arrays.sort(nums);

        // 평균 출력
        System.out.println(sum / 5);
        // 중앙값 출력
        System.out.println(nums[2]);

        br.close();



    }
}
