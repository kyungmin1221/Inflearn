package Inflearn.Inflearn;

// 소수 구하기 ( 에라토스테네스 체 ) //
// 중요 !
/*
자연수 N이 입력되면 1부터 N까지 소수를 구하는 프로그램을 작성
 */

import java.util.Scanner;

public class Inflearn17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N+1];             // 0 자리를 제외하고 한 칸 늘리기 위햐
        int count = 0;                      // 소수 개수 출력을 위한 변수
        for(int i = 1; i<=N; i++) {         // 1 부터 N까지 숫자를 배열에 차례대로 삽입
            A[i] = i;
        }
        for(int i=2; i<=Math.sqrt(N); i++) {            // 2 ~ N의 제곱근까지
            if(A[i] == 0) {
                continue;
            }
            for(int j = i+i; j<=N; j=i+j) {
                A[j] = 0;
            }
        }
        for(int i=2; i<=N; i++) {
            if(A[i] != 0) {                     // 배열의 수가 0 이 아닐시 카운트 증가
                count ++;
            }
        }
        System.out.println(count);
    }
}
