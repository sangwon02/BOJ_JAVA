package boj5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            switch (c) {
                case 'A': case 'B': case 'C':
                    totalTime += 3; // 숫자 2: 3초
                    break;
                case 'D': case 'E': case 'F':
                    totalTime += 4; // 숫자 3: 4초
                    break;
                case 'G': case 'H': case 'I':
                    totalTime += 5; // 숫자 4: 5초
                    break;
                case 'J': case 'K': case 'L':
                    totalTime += 6; // 숫자 5: 6초
                    break;
                case 'M': case 'N': case 'O':
                    totalTime += 7; // 숫자 6: 7초
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    totalTime += 8; // 숫자 7: 8초
                    break;
                case 'T': case 'U': case 'V':
                    totalTime += 9; // 숫자 8: 9초
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    totalTime += 10; // 숫자 9: 10초
                    break;
            }
        }

        System.out.println(totalTime);
        br.close();
    }
}