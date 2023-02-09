package Inflearn.Inflearn;
// 강의 2장 1번 //

// 큰 수 출력하기 //
/*
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성
( 첫 번째 수는 무조건 출력 )
- 첫 줄에 자연수 N( 1<= N <= 100 ) 이 주어지고, 그 다음 줄에 N개의 정수가 입력
- 자신의 바로 앞 수보다 큰 수만 한 줄로 출력
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn13 {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();     // add() 사용을 위함
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();                      // 자연수 개수 저장 변수
        int[] A = new int[N];                           // 배열 선언
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();               // 배열에 저장
        }
        answer.add(A[0]);                           // 베열의 첫번째 숫자 저장
        for(int i=1; i<N; i++) {
            if(A[i] > A[i-1]) {                     // 뒤에 숫자가 앞숫자보다 크다면
                answer.add(A[i]);                   // 변수에 저장
            }
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
