package boj1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        // n개의 단어를 입력받아 하나씩 확인
        for (int i = 0; i < n; i++) {
            // check() 함수를 호출해서 그룹 단어이면 카운트를 1 늘림
            if (check(br.readLine())) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
        br.close();
    }

    // 그룹 단어인지 판별하는 함수
    public static boolean check(String word) {
        // 알파벳 등장 기록을 저장할 boolean 배열 생성 (a-z: 26개)
        boolean[] appeared = new boolean[26];
        //바로 이전 문자를 저장할 변수
        char prevChar = 0;

        // 단어의 각 문자를 처음부터 끝까지 확인한다
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // 이전 문자와 현재 문자가 다를 경우
            if (prevChar != currentChar) {
                // 이 새로운 문자가 과거에 등장한 기록이 있는지 확인
                if (appeared[currentChar - 'a']) {
                    // 기록이 있다면, 연속이 깨진 것이므로 그룹 단어가 아님
                    return false; // 즉시 함수 종료
                }

                // 과거 기록에 없다면, 이 문자가 등장했다고 기록
                appeared[currentChar - 'a'] = true;
                // 이전 문자(prevChar)를 현재 문자(currentChar)로 갱신한다.
                prevChar = currentChar;
            }
        }

        // for문이 중간에 false로 끝나지 않고 무사히 완료되면 그룹 단어
        return true;
    }
}