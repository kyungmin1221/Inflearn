package Inflearn.Inflearn;

// 피보나치 수열 //
/*
1 ) 피보나치 수열을 출력한다. 피보나치 수열이랑 앞의 2개의 수를 합하여 다음 숫자가 되는 수열임 .
2 ) 입력은 피보나치 수열의 총 항의 수 이다.  만약 7이 입력되면 1 1 2 3 5 8 13 을 출력한다 .

- 첫 줄에 총 항수 N ( 3 <= N <= 45 )이 입력
 */

import java.util.Scanner;

public class Inflearn16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] answer = new int[N];
        answer[0] = 1;              // 첫번째 두번째 배열의 수는 1로 고정
        answer[1] = 1;
        for(int i=2; i<N; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
