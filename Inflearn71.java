package Inflearn.Inflearn;

import java.util.Scanner;

// 회문문자열
// 프로그래머스형식 문제 -> 함수를 사용

class So {
    private String str;
    public So() {}   // 생성자
    public String Solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return "NO";
            }
        return answer;
        }
    }
public class Inflearn71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        So so = new So();
        System.out.println(so.Solution(str));
    }
}
