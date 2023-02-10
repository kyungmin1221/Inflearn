package Inflearn.Inflearn;

// 점수 계산 //

/*
1 0 이 섞여 있는 수에서 맞는 건 1 , 틀린건 0으로 표시
맞으면 1점 , 틀리면 0 점으로 계산한다. 단 연속으로 정답일시 +1 점씩 추가한다.
즉,  1 1 0 1  일 경우 점수는 1 + 2 + 1 = 4 이다.
 */

import java.util.Scanner;

public class Inflearn19 {
    public int solution(int N, int[] A) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            if (A[i] == 1) {        // A의 배열의 원소가 1 일시
                count ++;           // 카운트 증가
                answer += count;
            }
            else {                  // 1이 아닐시 카운트값 0으로 초기화
                count = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn19 inflearn19 = new Inflearn19();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i =0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(inflearn19.solution(N,A));

    }
}

// if 문에서 굳이 if(A[i+1]) 을 써서 비교하려해서 문제가 생겼었음
// 쉽게 생각해보자