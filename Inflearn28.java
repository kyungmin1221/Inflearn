package Inflearn.Inflearn;


// 연속 부분수열 //

/*
N개의 수로 이루어진 수열이 주어짐
이 수열에서 연속 부분 수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하시오
- 첫째 줄에 N ( 1<= N <= 100,000 ),M ( 1<= N <= 100,000 ) 이 주어진다.
- 수열의 원소값은 1,000을 넘지 않는 자연수임
- 첫째 줄에 경우의 수를 출력한다.
 */

import java.util.Scanner;

public class Inflearn28 {
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
        Inflearn28 inflearn27 = new Inflearn28();
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
