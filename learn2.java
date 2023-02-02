package Inflearn.Inflearn;

import java.util.Scanner;

public class learn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
            /* 아스키코드로 푸는 법
            if(x>=97 && x<=122) {
                answer += (x+32);
            }else {
                answer += (x-32);
            }   */

        }
        System.out.println(answer);
    }
}
