package boj2562;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int j = Integer.parseInt(br.readLine());
            arr[i] = j;
        }

        int max = arr[0];
        int maxindex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // 큰 값을 발견하면
                max = arr[i];   // 최댓값을 교체
                maxindex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxindex+1);
        br.close();
    }
}
