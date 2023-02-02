package Inflearn.Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answer = new ArrayList<>();       // arraylist 선언
        int n = scanner.nextInt();
        String[] A = new String[n];
        for(int i=0; i< A.length; i++) {
            A[i] = scanner.next();                // 입력한 n 만큼 배열에 넣는다
        }
        for(String x : A) {
            String tmp = new StringBuilder(x).reverse().toString();     // reverse() 메소드를 사용하기 위해 stringbuilder 사용
            answer.add(tmp);                // arraylist 에 넣을때는 add() 사용 !
        }
        for(String x : answer) {
            System.out.println(x);       // 출력
        }
    }
}
