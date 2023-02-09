package Inflearn.Inflearn;

// 가위 바위 보 //
/*
A,B 두 사람이 가위바위보 게임을 한다.
총 N번의 게임을 하여 A가 이기면 A를 출력하고 , B가 이기면 B를 출력한다.
비길 경우에는 D를 출력한다.
가위 바위 보의 정보는 -> 가위 : 1 , 바위 : 2 , 보 : 3 으로 정함
<엽력>
- 첫번째 줄에 게임 횟수 N 입력
- 두번째 줄에 A가 낸 가위 바위 보 정보 N개 입력
- 세번째 줄에 B가 낸 가위 바위 보 정보 N개 입력
<출력>
- 각 줄에 각 게임 승자를 출력
 */

import java.util.Scanner;

public class Inflearn15 {
    public String solution(int N, int[] A, int[] B) {
        String answer ="";                  // 출력을 위한 빈 문자열 생성
        for(int i =0; i<N; i++) {
            if(A[i] == B[i]) {
                answer += "D";
            } else if (A[i]==1 && B[i]==3) {
                answer += "A";
            } else if (A[i]==2 && B[i]==1) {
                answer += "A";
            }else if (A[i]==3 && B[i]==2) {
                answer += "A";
            } else {                            // A가 이기는 경우를 제외한 모든 경우는 B 가 이기는 경우
                answer += "B";
            }
        }
        return answer;                  // 누적한 answer 리턴
    }
    public static void main(String[] args) {
        Inflearn15 inflearn15 = new Inflearn15();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i=0; i<N; i++) {
            B[i] = scanner.nextInt();
        }
        for(char x : inflearn15.solution(N,A,B).toCharArray()) {         // 새로운 문자열 생성 -> toCharArray()
            System.out.println(x);

        }
       //  System.out.print(inflearn15.solution(N,A,B));     // 이것만 쓰면 한줄로만 출력됌
    }
}
