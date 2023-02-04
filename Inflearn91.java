package Inflearn.Inflearn;

// 아스키 코드 사용하여 문제 해결 방식 //

// 숫자만 추출
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
// 맨 앞의 자연수가 0 일 경우 맨앞의 0은 고려하지 않습니다.
// 0127 -> 127

import java.util.Scanner;
public class Inflearn91 {
    // 메소드사용
    public int Solution(String str) {
        int answer = 0;
        for(char x : str.toCharArray()) {
            if(x>=48 && x<=57) answer = answer*10 + (x-48);   // 숫자 0 - 9 를 아스키로 바꾸면 48 - 57
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn91 inflearn91 = new Inflearn91();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(inflearn91.Solution(str));
    }
}
