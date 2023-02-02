package Inflearn.Inflearn;

import java.util.Scanner;
// 주어진 문자열에서 중복문자 제거 문제
// charAt() 의 활용
public class Inflearn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) {   // 문자의 인덱스 번호와 i 가 같다면
                answer += str.charAt(i);        // 변수에 문자 저장
            }
        }
        System.out.println(answer);     // 출력
    }
}
