package Inflearn.Inflearn;

import java.util.Scanner;

public class InfLearn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s ) {
            int len = x.length();
            if(len>m) {
                m = len;
                answer = x;   // 최대값을 찾을때 마다 answer 변수에 넣어준다
            }
        }
        /*
        // indexOf() 와 subString() 의 이용 !!

        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1) {          // ' ' 을 기준으로 띄어쓰기를 발견 못할시ㅅ까지 반복
            String tmp = str.substring(0,pos);        // 0 ~ pos 전까지 문자를 자름
            int len = str.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);    // 첫번째 문자 자른곳에서 +1 , 즉 다음 인덱스부터 다시 반복문 시작
        } */
        System.out.println(answer);
    }
}
