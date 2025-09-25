package boj1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer a = new StringTokenizer(br.readLine());
        HashSet<Integer> setA = new HashSet<>();

        int countA = Integer.parseInt(st.nextToken());
        int countB = Integer.parseInt(st.nextToken());
        // 집합A의 개수 만큼 setA에 저장
        for (int i = 0; i < countA; i++) {
            setA.add(Integer.parseInt(a.nextToken()));
        }
        StringTokenizer b = new StringTokenizer(br.readLine());
        HashSet<Integer> setB = new HashSet<>();
        // 집합A의 개수 만큼 setA에 저장
        for (int i = 0; i < countB; i++) {
            setB.add(Integer.parseInt(b.nextToken()));
        }
        int intersectionCount = 0; // 교집합 원소의 개수
        // setA를 순회하며 setB에 있는 원소를 if문으로 찾는다.
        for (Integer num : setA) {
            if (setB.contains(num)) {
                // 있다면 교집합의 개수를 센다
                intersectionCount++;
            }
        }

        // (A의 크기 - 교집합) + (B의 크기 - 교집합) = 차집합의 크기
        int result = (countA - intersectionCount) + (countB - intersectionCount);
        System.out.println(result);


        br.close();


    }
}
