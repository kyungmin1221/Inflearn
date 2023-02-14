package Inflearn.Inflearn;

// 격자판 최대합 //

/*
5*5 숫자가 적혀있는 격자판이 주어지면 , 각 행, 열, 대각선의 합중 가장 큰 합(최대합)을 출력

- 첫 줄에 자연수 N이 주어짐 ( 2<=N<=50 )
 */
import java.util.Scanner;

public class Inflearn21 {
    public int solution(int N, int[][] A) {
        int answer = Integer.MIN_VALUE;
        int sumWidth ;    // 행
        int sumHeight ;   // 열
        for(int i=0; i<N; i++) {
            sumWidth =0;
            sumHeight = 0;
            for(int j=0; j<N; j++) {
                sumWidth += A[i][j];              // 행 합 누적
                sumHeight += A[j][i];             // 열 합 누적
            }
            answer = Math.max(answer,sumWidth);         //  행 합 중 최대합
            answer = Math.max(answer,sumHeight);        //  열 합 중 최대합
        }

        sumWidth = sumHeight = 0;           // 대각선의 합을 구하기 위해 변수 초기화

        for(int i=0; i<N; i++) {
            sumWidth += A[i][i];           // 왼쪽상단 - 오른쪽 하단 대각선의 합
            sumHeight += A[i][N-i-1];       // 오른쪽상단 - 왼쪽 하단 대각선의 합
        }
        answer = Math.max(answer,sumWidth);          // 왼쪽상단 - 오른쪽 하단 대각선의 합 중 최대합
        answer = Math.max(answer,sumHeight);        // 오른쪽상단 - 왼쪽 하단 대각선의 합 중 최대합

        return answer;
    }
    public static void main(String[] args) {
        Inflearn21 inflearn21 = new Inflearn21();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println(inflearn21.solution(N,A));
    }
}
