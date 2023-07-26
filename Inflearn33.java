package Inflearn.Inflearn;

// 매출액의 종류 //

/*
현수의 아빠는 제과점을 운영한다.
현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했다

만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10

각 연속 4일간의 구간의 매출종류는
첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
매출액의 종류를 출력하는 프로그램을 작성

<입력>
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어진다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수이다.
<출력>
첫 줄에 각 구간의 매출액 종류를 순서대로 출력한다.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inflearn33 {
    public ArrayList<Integer> solution(int N, int K, int[] A) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // 0 ~ K-1 까지 키 값 저장 후 횟수 저장
        for(int i =0; i<K-1; i++) {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        // 슬라이딩 윈도우 활용 //  lt 초기값 설정
        int lt = 0;
        for(int rt=K-1; rt<N; rt++) {
            map.put(A[rt],map.getOrDefault(A[rt],0)+1);
            // 4번째 크기까지의 배열 사이즈를 answer에 추가
            answer.add(map.size());
            // A[lt] 의 값 -1
            map.put(A[lt],map.get(A[lt])-1);
            //  A[lt] 의 값 -1 을 한 값이 0 이라면 원소가 없다는 뜻 이므로 해당 키값을 삭제
            if(map.get(A[lt])==0) {
                map.remove(A[lt]);
            }
            // lt 값 증가하여 배열의 위치를 오른쪽으로 한칸 씩 증가
            lt++;
        }
        // 사이즈를 넣은 리스트 반환
        return answer;

    }
    public static void main(String[] args) {
        Inflearn33 inflearn33 = new Inflearn33();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        // 츨력히면 [ 3, 4, 4 ,3 ] 인 리스트 형태로 나오기 때문에 반복문으로 int형을 만들어줌
        for(int x : inflearn33.solution(N,K,A)) {
            // 한칸 씩 띄어서 출력
            System.out.print(x + " ");
        }
    }
}
