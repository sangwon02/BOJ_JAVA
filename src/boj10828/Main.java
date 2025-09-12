package boj10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}