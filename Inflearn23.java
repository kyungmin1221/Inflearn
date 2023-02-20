package Inflearn.Inflearn;

// 임시반장 정하기 //
/*

3이상 1000이하의 학생수가 주어진다
반장을 뽑으려고 하는데 기준은 같은 반이였던 경우가 가장 많았던 학생을 반장으로 선출한다.
반장을 선출하는 프로그램을 작성하라

- 첫쨰 줄에는 반의 학생 수를 나타내는 정수가 주어짐 , 학생 수는 3이상 1000 이하
- 둘째 줄 부터는 열 기준 1번 학생부터 각 줄마다 1학년부터 5학년까지 몇 반이였는지 나타내는 5개의 정수가 존재 ( 격자판 느낌 )
- 주어지는 정수는 1이상 9이하의 정수
- 출력은 그 학생의 번호 ( 즉 열번호 ) 로 출력
 */

import java.util.Scanner;

public class Inflearn23 {
    public int solution(int N, int[][] A) {
        int answer = 0;                     // 출력을 위한 변수 설정
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=N; i++) {           // 몇번 몇학년
            int count =0;
            for(int j=1; j<=N; j++) {       // 학년을 위한 반복문 , 1학년부터 시작을 의미
                for(int k=1; k<=5; k++) {
                    if(A[i][k] == A[j][k]) {
                        count ++;           // 카운트 증가
                        break;              // 같은 학년이었던거 발견시 반복문 종료
                    }   // if문 종료
                }   // for문 k문 종료
            }     // for문 j문 종료
            if(count>max) {
                max = count;
                answer = i;                 // 출력변수에 현재 돌고 있던 i 번째 학생을 저장
            }
        }   // for문 i문 종료
        return answer;
    }
    public static void main(String[] args) {
        Inflearn23 inflearn23 = new Inflearn23();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A  = new int[N+1][N+1];       // 1번 , 1학년 부터 시작이므로
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=5; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println(inflearn23.solution(N,A));
    }
}
