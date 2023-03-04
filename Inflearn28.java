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
    public int solution(int N, int M, int[] A) {

    }
    public static void main(String[] args) {
        Inflearn28 inflearn28 = new Inflearn28();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();      // N 개의 수열
        int M = scanner.nextInt();      // 합이 특정숫자 M
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(inflearn28.solution(N,M,A));
    }
}
