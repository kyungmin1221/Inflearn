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
import java.util.Arrays;
import java.util.Scanner;



// 투 포인터 방식 사용 //
public class Inflearn261 {
    public ArrayList<Integer> soluton(int N, int[] A, int M, int[] B) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(A);         // 먼저 배열 A,B 를 오름차순으로 정렬
        Arrays.sort(B);
        int p1 = 0;         // 각 두 배열을 가르키는 포인터 선언 , 시작위치는 배열의 첫 번째를 가르켜야하므로 0으로 초기화
        int p2 = 0;
        while(p1<N && p2<M) {           // 포인터가 배열의 크기보다 작으면 계속 반복
            if(A[p1]==B[p2]) {          // 두 배열이 가르키는 인덱스 수가 같다면
                answer.add(A[p1++]);       // p1 을 리스트에 저장후 증가 !!
                p2 ++;                      // p2 도 증가
            } else if (A[p1]<B[p2]) {       // p1이 p2보다 작으면 p1을 증가
                p1 ++;
            }
            else {
                p2++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn261 inflearn261 = new Inflearn261();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] B= new int[M];
        for(int i=0; i<M; i++) {
            B[i] = scanner.nextInt();
        }
        for(int x : inflearn261.soluton(N,A,M,B)) {
            System.out.print(x + " ");
        }
    }
}
