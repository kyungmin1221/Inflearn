package Inflearn.Inflearn;


import java.util.Scanner;

public class learn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();   // 문자 입력
        char c = scanner.next().charAt(0);     // 찾을 문자 입력
        int num = 0;    // 문자 개수를 담을 변수
        str = str.toLowerCase();      // 받은 문자를 모두 소문자로 변경
        c = Character.toLowerCase(c);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==c)
                num ++;
        }
        System.out.println(num);

    }
}
