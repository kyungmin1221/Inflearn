package Inflearn.Inflearn;

// 암호 //
/* 비밀편지는 알파벳 한 문자마다 # 또는 * 이 일곱개로 구성되어 있음
만약 "#*****#" 으로 구성된 문자를 보냈다면 약속한 규칙대로 다음과 같이 해석함
1. #은 이진수의 1로, *은 이진수의 0으로 변환 , 즉 1000001 로 변환됌
2. 바뀐 2진수를 10진수화 함, 1000001 을 10진수화 하면 65가 됌.
3. 아스키 번호가 65 문자로 변환, 즉 65 -> A

< 예시 >
4
#****###**#####**#####**##**       ->       COOL

*/

import java.util.Scanner;

public class Inflearn12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();          // 문자길이
        String  str = scanner.next();       // 문자열 입력
        String answer = "";                 // 출력 문자열
        for(int i=0; i<N; i++) {
            /* 문자를 숫자로 변경 할 변수
            str.substring(0,7) -> 0 ~ 6 까지
            replace('#','1') -> 문자 '#'을 '1'로 변경함
            */
            String temp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(temp,2);     // temp 문자열을 2진수로 변경
            answer += (char)num;                        // 2진수를 10진수화함
            str = str.substring(7);            // 7번째 문자열부터 시작하는것으로 초기화
        }
        System.out.println(answer);                // 출력
    }
}
