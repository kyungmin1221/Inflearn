package Inflearn.Inflearn;

import java.util.Scanner;

// 펠린드롬 ( replaceAll() 정규식 문제 )
// 팰린드롬 : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열을 말함
// 주어진 문자열이 팰린드롬인지 확인하는 문제
// replaceAll(pattern , str) -> pattern(정규표현식) 과 일치히는 문자열들을 str(문자열) 로 바꾸어줌  
public class Inflearn8 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toLowerCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Inflearn8 learn = new Inflearn8();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();  // 여러개 문자 입력
        System.out.println(learn.solution(str));

    }
}
