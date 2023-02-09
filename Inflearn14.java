package Inflearn.Inflearn;

// 보이는 학생 //
/*
N명의 학생을 일렬로 세움
일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님의 볼 수 있는 최대 학생의 수를 구하는 프로그램 작성
( 앞에 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다. )
- 첫 줄에 정수 N이 입력, 그 다음줄에 N명의 학생들 키가 앞에서부터 주어짐
 */

import java.util.Scanner;

public class Inflearn14 {
    public int solution(int n, int[] arr) {
        int answer = 1, max =arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn14 inflearn14 = new Inflearn14();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(inflearn14.solution(n,arr));
    }
}

        /*
        // 내가 해본 방식 //

        int N = scanner.nextInt();
        int[] A = new int[N];           // 배열 선언
        int count = 1;                  // 출력할 변수 , 맨 처음 사람은 무조건 보이기때문에 초기값을 1로 설정
        int max = A[0];                 // 최대값을 맨 앞사람 으로 설정
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i=1; i<N; i++) {
            if(A[i] > max) {            // 두번째 사람부터 최대값보다 클 시
                count ++;               // 카운트 증가
                max = A[i];             // 최댓값 교체
            }
        }
        System.out.println(count);
    }
}
*/