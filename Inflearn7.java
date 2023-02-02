package Inflearn.Inflearn;

import java.util.Scanner;

public class Inflearn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str= str.toLowerCase();             // 받은 문자열을 모두 소문자로 변경
        int flag = 0;                       // 플래그 변수 활용
        char[] s = str.toCharArray();     // 받은 문자열을 새로운 문자열 s 로 선언
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i)!= str.charAt(len-i-1))     // len-i-1 이어야만 만약 i가 0일때 마지막 인덱스부터 검사할 수 있음
                flag = 1;                               // 비교해서 다를시 플래그를 변경
        }

        // 플래그에 따라 출력
        if(flag ==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
