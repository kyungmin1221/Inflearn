package Inflearn.Inflearn;


import java.util.Scanner;

// isDigit() 시용 
// 숫자만 추출
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
// 맨 앞의 자연수가 0 일 경우 맨앞의 0은 고려하지 않습니다.
// 0127 -> 127
public class Inflearn9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = "";
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x))    // isDigit() : 숫자인지 확인하는 Character 의 메소드
                answer += x;
        }
        answer = String.valueOf(Integer.parseInt(answer));
        System.out.println(answer);
    }
}
