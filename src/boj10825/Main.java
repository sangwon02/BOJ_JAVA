package boj10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;


    }
}

public class Main {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            // 읽어온 정보로 새로운 Student 객체를 만들어서 배열에 저장한다.
            students[i] = new Student(name, korean, english, math);
        }

        // Comparator를 사용해서 정렬
        Arrays.sort(students, new  Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 1. 국어 점수 내림차순
                if (s1.korean != s2.korean) {
                    return s2.korean - s1.korean; // 큰게 앞으로
                }
                // 2. 영어 점수 오름차순
                if (s1.english != s2.english) {
                    return s1.english - s2.english; // 작은게 앞으로
                }
                // 3. 수학 점수 내림차순
                if (s1.math != s2.math) {
                    return s2.math - s1.math; // 큰게 앞으로
                }
                // 4. 이름 오름차순
                return s1.name.compareTo(s2.name); // 사전순
            }

        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        br.close();
    }
}
