package Inflearn.Inflearn;

// 교육과정 설계 //
// 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Inflearn45 {
    private String solution(String lectureOrder,String lecturePlan) {
        Queue<Character> queue = new LinkedList<>();
        char[] charArray1 = lectureOrder.toCharArray();
        char[] charArray2 = lecturePlan.toCharArray();
        String answer = "Yes";
        for(int i=0; i<charArray1.length; i++) {
            // 대문자 아니면
            if(!Character.isUpperCase(charArray1[i])) {
                answer = "NO";
            }
            queue.offer(charArray1[i]);
        }
        for(int i=0; i<charArray2.length; i++) {
            if(queue.contains(charArray2[i])) {
                if(queue.poll() != charArray2[i]) {
                    return "NO";
                }
            }
        }
        // 큐가 비어있지 않다면 계획한 수업설계중에 수업을 안들은것이 있다라는것을 의미
        if(!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Inflearn45 inflearn45 = new Inflearn45();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 필수과목의 순서
        // 대문자
        // CBA 입력
        String lectureOrder = bf.readLine();

        // 계획한 수업설계
        // 길이는 30이하
        // CBDAGE 입력
        String lecturePlan = bf.readLine();
        System.out.println(inflearn45.solution(lectureOrder,lecturePlan));
    }
}
