package Inflearn.Inflearn;

// 모든 아나그램 찾기 //

/*
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성

아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 한다


<입력>
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력된다

S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같다


<출력>
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력한다.

출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inflearn34 {
    public ArrayList<Integer> solution(String s, String t) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 문자열s
        HashMap<Character, Integer> map = new HashMap<>();
        // 문자열t
        HashMap<Character, Integer> map2 = new HashMap<>();

        // 문자열s
        char [] arr1 = s.toCharArray();        // 길이 9
        // 문자열t
        char [] arr2 = t.toCharArray();     // 길이 3

        // t 문자열의 키-깂 확인
        for(int i=0; i<arr2.length; i++) {
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }
        // s 문자열에서 3개씩 s 문자열의 키가 있는지 확인
        int count = 0;
        int lt = 0;
        for(int rt = 0; rt<arr1.length; rt++) {
            map.put(arr1[rt],map.getOrDefault(arr1[rt],0)+1);

            if(rt-lt+1 == arr2.length) {
                if(map.equals(map2)) {
                    count ++;
                }
                map.put(arr1[lt],map.get(arr1[lt])-1);
                if(map.get(arr1[lt])== 0) {
                    map.remove(arr1[lt]);
                }
                lt ++;
            }
        }
        answer.add(count);
        return answer;
    }
    public static void main(String[] args) {
        Inflearn34 inflearn34 = new Inflearn34();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        for(int x : inflearn34.solution(s,t)) {
            System.out.println(x);
        }

    }
}















