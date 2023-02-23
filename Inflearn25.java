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

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn25 {
    public ArrayList<Integer> solution(int N, int[] A, int M, int[] B) {
        ArrayList<Integer> answer = new ArrayList<>();







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
            System.out.println(x + " ");
        }
      //  System.out.println(inflearn25.solution(N,A,M,B));
    }
}
