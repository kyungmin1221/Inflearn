package Inflearn.Inflearn;

// 공통원소 구하기 //
/*
A,B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력

첫 번째 줄에 집합 A의 크기 ( 1<=N<= 30,000) 이 주어짐
두 번째 줄에 N개의 원소가 주어짐 ( 원소 중복되지 않음 )
세 번째 줄에 집합 B의 크기 ( 1<=M<= 30,000) 이 주어짐
네 번째 줄에 M개의 원소가 주어짐 ( 원소 중복되지 않음 )

- 두 집합의 공통원소를 오름차순으로 정렬
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inflearn26 {
    public ArrayList<Integer> solution(int N, int[] A, int M, int[] B) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                if(A[i] == B[j]) {
                    answer.add(A[i]);
                    break;              // 원소 중복을 허용하지 않음으로 공통원소를 찾으면 반복문 종료
                }
            }
        }
        Collections.sort(answer);       // Arrays.sort() 는 '배열'의 오름차순 정렬
        return answer;
    }
    public static void main(String[] args) {
        Inflearn26 inflearn26 = new Inflearn26();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] B = new int[M];
        for(int i=0; i<N; i++) {
            B[i] = scanner.nextInt();
        }
        for(int x : inflearn26.solution(N,A,M,B)) {
            System.out.print(x + " ");           // 공통 원소 출력  // 이 방법은 시간초과 걸림
        }
    }
}
