package boj1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt  = 0; // 그룹단어를 카운트할 변수

        for(int  i = 0; i  < n; i++){
            if(checkfunc(br.readLine())){ //한 줄씩 문자열을 받아서 만약 유효성이 통과되면
                cnt++;
            }
        }


        System.out.println(cnt); // 단어 개수를 출력한다.
        br.close();
    }

    static boolean checkfunc(String str){
        boolean[] checkAlpha = new boolean[26]; // 입력받은 값이 영어임으로 영어의 개수만큼 배열 생성
        int prev = -1; // 이전 문자의 인덱스값을 저장하는 변수

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); // 현재의 문자의 아스키 코드값을 저장

            if(prev != now){ //이 전 문자와 i번째 문자가 같지 않다면
                if(checkAlpha[now-97] == false){
                    checkAlpha[now-97] = true;
                    prev = now;

                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true; // 그룹 문자인 경우
    }
}