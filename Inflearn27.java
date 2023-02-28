package Inflearn.Inflearn;

// 최대매출 //

/*
만약 N = 10 이고, 10일간의 매출 기록이 아래와 같다.  이때 k=3 이면 ,
12 15 11 20 25 10 20 19 13 15  일때,
연속된 3일간의 최대 매출액은 11 + 20 + 25 = 56 (만원) 이다.
k일때 최대 매출액을 구하시오.

- 첫 줄에 N ( 5 <= N <= 100,000 )과 K ( 2 <= K <= N ) 가 주어짐
- 두 번째 줄에 N개의 숫자열이 주어진다, 각 숫자는 500 이하의 음이 아닌 정수입니다.

 */


import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn27 {
    public int solution(int N, int K, int[] A) {
        int answer =0;              // 출력을 위한 변수
        int sum=0;                  // 3개씩 합을 구할 변수
        for(int i=0; i<K; i++) {        // 0 부터 K 까지의 합을 sum 변수에 저장
            sum += A[i];
        }
        answer = sum;                   // 0 부터 K 까지의 합을 sum 변수에 저장 -> answer 에 넘겨줌
        for(int i=K; i<N; i++) {        // 그 다음 3개씩 합을 계산하기 위해 새로운 for문 작성
            sum += (A[i]-A[i-K]);
            answer = Math.max(sum,answer);          // sum, answer 중 더 큰값을 answer 에 저장
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn27 inflearn27 = new Inflearn27();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();          // 입력할 정수의 갯수
        int K = scanner.nextInt();          // 매출을 구할 K 일수
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(inflearn27.solution(N,K,A));
    }
}
