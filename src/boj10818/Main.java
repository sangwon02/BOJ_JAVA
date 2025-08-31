package boj10818;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // n개의 숫자를 입력받아 배열에 저장
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // 더 작은 값을 발견하면
                min = arr[i];   // 최솟값을 교체
            }
            if (arr[i] > max) { // 큰 값을 발견하면
                max = arr[i];   // 최댓값을 교체
            }
        }

        System.out.println(min + " " + max);

        br.close();
    }
}