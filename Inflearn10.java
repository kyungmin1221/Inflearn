package Inflearn.Inflearn;

import java.util.Scanner;

// 가장 짧은 문자거리
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성

// 해결방식 //
// 왼쪽부터 for문을 돌면서 t문자면 p를 0 으로 만들어 초기화하고 , t문자가 아닐시 1씩 증가함 , 이과정을 반복
// 오른쪽부터 왼쪽으로 for문을 돌면서 역시나 t문자면 p를 0 으로 만들어 초기화함 , t문자가 아닐시 숫자를 1씩 증가하지만
// 증가된 숫자가 원래 있던 숫자보다 작을경우에만 적용함
// ex ) 1 , 3 -> 1선택
public class Inflearn10 {
    public int[] solution(String s , char t) {       // 배열로 리턴
        int[] answer = new int[s.length()];         // 출력을 할 배열 선언
        int p = 1000;                               // 초기 길이를 크게 잡음
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;       // 배열에 삽입
            }
        }
        p = 1000;
        for(int i = s.length()-1; i>=0; i--) {     // 배열의 끝에서부터 for문 다시 돔
            if(s.charAt(i) == t ) {
                p=0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p);     // 둘중 작은 숫자로 선택
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn10 inflearn10 = new Inflearn10();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = scanner.next().charAt(0);    // 문자열 하나만 읽을 때 !!!!
        for(int x : inflearn10.solution(s,c)) {
            System.out.print(x + " ");
        }
    }
}
