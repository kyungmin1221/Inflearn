package Inflearn.Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answer = new ArrayList<>();
        int N = scanner.nextInt();
        String[] A = new String[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.next();
        }

        for(String x : A) {
            char[] s = x.toCharArray();    // 받은 문자열A를 문자열 배열로 선언
            int left =0;
            int right = x.length()-1;        // 길이의 -1 를 해야 알맞은 인덱스번호
            while(left < right) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
            String str = String.valueOf(s);  // NullPointerException를 발생방지, toString()은 NullPointerException를 발생시킴
            answer.add(str);
        }
        System.out.println(answer);
        

    }
}
