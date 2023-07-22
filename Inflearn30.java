package Inflearn.Inflearn;

// 최대 길이 연속부분수열 //

/*
0과 1로 구성된 길이가 N인 수열이 주어진다.
이 수열에서 최대 k번을 0을 1로 변경할 수 있음
최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성

만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

1 1 0 0 1 1 0 1 1 0 1 1 0 1

만들 수 있는 1이 연속된 연속부분수열은

1 1 0 0  | 1 1 1 1 1 1 1 1 | 0 1

이고 그 길이는 8 이다 .

 */

import java.util.Scanner;

public class Inflearn30 {
    public int solution(int N,int K, int[] A) {
        int answer = 0;                 // 출력 변수
        int count =0;                   // 0 을 1 로 바꾼 횟수
        int lt =0;
        for(int rt=0; rt<N; rt++) {
            if(A[rt] == 0) {
                count ++;
            }
            while(count>K) {
                if(A[lt] == 0) {
                    count --;
                }
                lt ++;
            }
            answer = Math.max(answer, rt - lt +1);
        }       // for문 //
        return answer;
    }

    public static void main(String[] args) {
        Inflearn30 inflearn30 = new Inflearn30();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();          // 0,1 로 구성된 수열의 길이
        int K = scanner.nextInt();          // 0->1 이 가능한 최대 숫자
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(inflearn30.solution(N,K,A));
    }
}
