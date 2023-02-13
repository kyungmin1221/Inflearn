package Inflearn.Inflearn;

// 등수 구하기 //

/*
N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성
같은 점수가 입력될 경우 높은 등수로 동일 처리함
즉, 가장 높은 잠수가 92점인데 92점인 사람이 3명이면 1등이 3명이고 그 다음학생은 4등이됌
- 첫 줄에 N( 3<=N<=100 )이 입력, 두번째 줄에 국어점수를 뜻하는 N개의 정수 입력
 */


import java.util.Scanner;

public class Inflearn20 {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            int count = 1;
            for(int j=0; j<N; j++) {
                if(A[i]<A[j]) {
                    count++;     // 2
                }
                answer[i] = count;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn20 inflearn20 = new Inflearn20();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for(int x : inflearn20.solution(N,A)) {
            System.out.print(x + " ");
        }
    }
}
