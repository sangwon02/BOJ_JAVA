package boj25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // recursion 함수가 몇 번 호출되었는지 세는 변수
    static int cnt = 0;

    public static int recursion(String s, int l, int r){
        // 함수가 호출될 때마다 카운트 증가
        cnt++;

        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        // 새로운 문자열을 검사하기 전에 카운트 초기화
        cnt = 0;
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            String s = br.readLine();
            // 팰린드롬 여부 결과
            int result = isPalindrome(s);
            // 결과와 호출 횟수를 공백으로 구분해 출력
            sb.append(result).append(" ").append(cnt).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}