package Inflearn.Inflearn;

import java.util.Scanner;

// 특수문자가 무작위로 섞여있는 문자열에서 특수문자를 제외한 문자들을 서로 교환하는 문제 //
public class Inflearn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = "";
        char[] s = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left<right) {
            if(!Character.isAlphabetic(s[left])) {     // static메소드 character 메소드사용
                left++;                             // 알파벳이 아니라면 left 인덱스 증가
            } else if (!Character.isAlphabetic(s[right])) {
                right--;                            // 알파벳이 아니라면 right 인덱스 증가
            }
            else {                              // 둘다 알파벳일 경우
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left ++;
                right--;
            }
        }

        // NullPointerException를 발생방지, toString()은 NullPointerException를 발생시킴
        answer = String.valueOf(s);
        System.out.println(answer);    // answer 출력
    }
}
