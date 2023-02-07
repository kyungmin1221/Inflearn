package Inflearn.Inflearn;

// 문자열 압축
/* 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
문자열을 압축하는 프로그램을 작성, 단 반복횟수가 1인 경우는 생략
예시 > KKHSSSSSSE -> K2HS7E
 */

import java.util.Scanner;

public class Inflearn11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str +" ";         // 길이 +1 , 본래 문자열에 공백문자를 하나 만들어준다 , 마지막문자가 비교할 문자가 필요하기 때문 !
        String answer ="";      // 출력을 할 문자를 저장활 변수
        int count = 1;          // 반복횟수를 저장할 변수
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {         // 앞뒤 문자가 같을 시
                count++;                                    // 반복횟수 증가
            } else {                                        // 앞뒤문자가 다를 시
                answer += str.charAt(i);
                if(count>1) {                               // 반복횟수가 1 보다 크면
                    answer += String.valueOf(count);        // int형 변수를 string 화 하여 문자열에 저장
                    count = 1;                              // count 변수 1로 초기화
                }
            }
        }
       System.out.println(answer);
    }
}
