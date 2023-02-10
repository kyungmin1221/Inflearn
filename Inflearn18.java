package Inflearn.Inflearn;

// 뒤집은 소수 //
/*
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성 .
예를 들어 32응 뒤집으면 23이고, 23은 소수임.  그러면 23을 출력 ( 단 910 을 뒤집으면 19로 숫자화 해야함 )
첫 자리부터 연속된 0은 무시한다.

- 첫줄에 자연수의 개수 N( 3<=N<=100 ) 이 주어지고, 그 다음 줄에 N개의 자연수가 주어짐

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn18 {
    public boolean isPrime(int num) {
        if(num == 1)
            return false;
        for(int i =2;i<num; i++) {
            if(num%i == 0 )
                return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int N , int[] A) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int temp = A[i];
            int res = 0;
            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            if(isPrime(res))
                answer.add(res);
        }
            return answer;
    }
    public static void main(String[] args) {
        Inflearn18 inflearn18 = new Inflearn18();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for(int x : inflearn18.solution(N,A)) {
            System.out.print(x +" ");
        }
    }
}

/*
해결할 때 어려웠던 문제
여러 함수의 사용과 수의 나머지와 몫을 이용하여 해결하는 문제 복습 필요
 */
