package Inflearn.Inflearn;

// 봉우리 //
/*
N*N 격자판이 주어진다. 각 격자판에 숫자는 그 지역의 높이를 뜻한다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역, 봉우리 지역이 몇 개 있는지 알아내는 프로그램을 작성
( 격자의 가장자리는 0으로 초기화 되었다고 가정 )

- 첫 줄에 자연수 N 이 주어짐 ( 2 <= N <= 50  )
- 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어짐. 각 자연수는 100을 넘지 않는다 .
- 봉우리 개수를 출력하라
 */

import java.util.Scanner;

public class Inflearn22 {
    public int solution(int N, int[][] A) {


    }
    public static void main(String[] args) {
        Inflearn22 inflearn22 = new Inflearn22();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {           // 5행 5열 격자판 입력
                A[i][j] = scanner.nextInt();
            }
        }   // for 문 종료
        System.out.println(inflearn22.solution(N,A));
    }
}
