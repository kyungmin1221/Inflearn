package Inflearn.Inflearn;

// 연속된 자연수의 합 //

/*
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성\

만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.

 */

import java.util.Scanner;

public class Inflearn29 {
    public int solution(int N,int A[]) {
        int answer = 0;
        int sum =0;
        int lt =0;
        for(int rt=0; rt<N/2+1; rt++) {         // 1 ~ 8
            sum += A[rt];
            if(N == sum) {
                answer ++;
            }

            while(sum>=N) {
                sum -= A[lt++];
                if(sum == N) {
                    answer ++;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn29 inflearn29 = new Inflearn29();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();      // 정수 입력 -> 15
        int[] A = new int[N];
        for(int i=0; i<N/2+1; i++){       // 0 ~ 8
            A[i] = i+1;                    // 배열에 1,2,3,4,5,6,7,8 저장
        }
        System.out.println(inflearn29.solution(N,A));


    }
}
