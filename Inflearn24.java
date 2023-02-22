package Inflearn.Inflearn;

// 멘토링 //
/*
첫 번째 줄에 학생수 N( 1<=N<=20 ) 과 수학테스트 횟수 M ( 1<=M<=10 )이 주어진다.
두 번째 줄에는 M개의 줄에 걸처 수학테스트 결과가 학생번호로 주어진다. 순서대로 1~N등 순이다.
3 4 1 2 라면 3번이 1등 2번이 꼴등이라는 말임.

- 짝을 만들수 있는 충 경우의 수를 출력
 */

import java.util.Scanner;

public class Inflearn24 {
    public int solution(int N,int M, int[][] A) {
        int answer = 0;




        return answer;
    }
    public static void main(String[] args) {
        Inflearn24 inflearn24 = new Inflearn24();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] A = new int[M][N];
        for(int i=0; i<M; i++) {    // 4
            for(int j=0; j<N; j++) {  // 3
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println(inflearn24.solution(N,M,A));
    }
}
