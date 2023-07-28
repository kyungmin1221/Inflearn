package Inflearn.Inflearn;

// K번째 큰 수 //

/*
<설명>
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있다.
현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록한다.
기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성.
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22.

<입력>
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력.
<출력>
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력한다.

 */

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Inflearn35 {
    public int solution(int N,int K,int[] A) {
        int answer = -1;
        // TreeSet : 이진 검색 트리 자료구조를 사용하여 요소들을 정렬하고 유지
        // 항상 정렬된 상태를 유지한다
        // 중복 요소 허용 안함
        // 자동 오름차순 정렬,  Comparator.reverseOrder() 를 사용해 내림차순으로 정렬
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int m=j+1; m<N; m++) {
                    set.add(A[i]+A[j]+A[m]);
                }
            }
        }
        int count = 0;
        // 숫자 3개씩 더한 합들이 set 에 오름차순으로 정렬된 상태
        for(int x : set) {
            count ++;
            if(count == K) {
                return x;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        Inflearn35 inflearn35 = new Inflearn35();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(inflearn35.solution(N,K,A));
    }
}
