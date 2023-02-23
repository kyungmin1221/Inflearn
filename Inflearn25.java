package Inflearn.Inflearn;


// 두 배열 합치기 //
/*
첫 번째 줄에 첫 번째 베열의 크기 N ( 1<=N<=100 )이 주어짐
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어짐
세 번째 줄에 두 번째 배열의 크기 M ( 1<=N<=100 )이 주어짐
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어짐
( 각 리스트의 원소는 int형 변수의 크기를 넘지 않음 )

- 오름차순으로 정렬된 배열을 출력
 */

import java.util.Arrays;
import java.util.Scanner;

public class Inflearn25 {
    public int[] solution(int N, int[] A, int M, int[] B) {
        int[] answer = new int[A.length + B.length];    // 출력하기 위한 배열 및 배열의 크기 선언
        for(int i=0; i<A.length; i++) {
            answer[i] = A[i];           // 출력을 위한 배열에 A[] 배열 원소 삽입
        }
        for(int i=0; i<B.length; i++) {
            answer[i+A.length] = B[i];     // 출력을 위한 배열에 B[] 베열 원소 삽입 ( A원소를 삽입한 마지막 인덱스 다음에 삽입 )
        }
        Arrays.sort(answer);                // 출력 배열 오름차순으로 정렬

        return answer;
    }
    public static void main(String[] args) {
        Inflearn25 inflearn25 = new Inflearn25();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();   // 배열의 크기 N 입력
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();       // 배열 입력
        }
        int M = scanner.nextInt();
        int[] B = new int[M];       // 배열 크기 M 입력
        for(int i=0; i<M; i++) {
            B[i] = scanner.nextInt();       // 배열 입력
        }
        for(int x : inflearn25.solution(N,A,M,B)) {
            System.out.print(x + " ");                      // 출력
        }
    }
}
