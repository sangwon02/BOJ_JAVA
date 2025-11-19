package boj9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            if (solve(input)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
        br.close();
    }

    public static boolean solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 여는 괄호는 스택에 넣는다.
            if (c == '(') {
                stack.push(c);
            }
            // 닫는 괄호를 만났을 때
            else if (c == ')') {
                // 스택이 비어있는데 닫는 괄호가 나오면 잘못된 문자열이다.
                if (stack.isEmpty()) {
                    return false;
                }
                // 짝이 맞는 여는 괄호를 스택에서 꺼낸다.
                stack.pop();
            }
        }

        // 마쳤는데 스택에 괄호가 남아있다면 잘못된 문자열
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}