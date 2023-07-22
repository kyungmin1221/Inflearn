package Inflearn.Inflearn;


// 학습 회장 ( 해쉬 ) //

/*
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정

첫 줄에는 반 학생수 N(5<=N<=50)이 주어잔다

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력

학급 회장으로 선택된 기호를 출력
 */

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn31 {
    public char solution(String s) {
        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {             // s(문자열)를 문자 배열로 변환 하고 x에 저장
            map.put(x,map.getOrDefault(x,0)+1);  // 횟수를 세기 위해서 +1 을 해준다.
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {              // map 의 key 들을 순회
            if (map.get(key) > max) {           // map.get(key) 은 key의 value 값을 구해줌
                max = map.get(key);
                answer = key;               // map.get(key) > max 를 만족하는 key 값을 answer에 저장
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn31 inflearn31 = new Inflearn31();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();    // 공백제거를 위해 next() 사용
        System.out.println(inflearn31.solution(str));
    }
}


