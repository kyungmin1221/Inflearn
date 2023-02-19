package Inflearn.Inflearn;

// 봉우리 //
/*
N*N 격자판이 주어진다. 각 격자판에 숫자는 그 지역의 높이를 뜻한다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역, 봉우리 지역이 몇 개 있는지 알아내는 프로그램을 작성
( 격자의 가장자리는 0으로 초기화 되었다고 가정 )

- 첫 줄에 자연수 N 이 주어짐 ( 2 <= N <= 50  )
- 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어짐. 각 자연수는 100을 넘지 않는다 .
- 총 봉우리 개수를 출력하라
 */

import java.util.Scanner;

public class Inflearn22 {

    // dx , dy 는 지정된 인덱스에서 위 아래 양쪽옆을 확인하기 위한 배열 설정
    int[] dx = {-1,0,1,0};         // 인덱스 0 ~ 3 , 크기 4
    int[] dy = {0,1,0,-1};
    public int solution(int N, int[][] A) {
        int answer =0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                boolean flag = true;
                for(int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    // if문 앞 조건을 만족하고 선택된 배열의 수가 확인한(위 아래 양쪽옆) 배열의 크기보다 작다면
                    if(nx>=0 && nx<N && ny>=0 && ny<N && A[i][j] < A[nx][ny]) {
                        flag = false;
                        break;              // if문 종료 , 하나라도 인덱스가 크면 다른건 확인해 볼 필요 없음
                    }
                }
                if(flag) {           // flag 가 참이 라면 봉우리이므로
                    answer ++;      // answer 증가
                }
            }
        }   // for문 중료
        return answer;
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
