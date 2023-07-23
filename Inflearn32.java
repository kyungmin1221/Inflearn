package Inflearn.Inflearn;

// 아나그램 (해쉬) //

/*
Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라 한다.

예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만
그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로

알파벳과 그 개수가 모두 일치한다.
 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 한다.

길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성.
아나그램 판별시 대소문자가 구분됩니다.

<입력>
첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력
단어의 길이는 100을 넘지 않는다
<출력>
두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn32 {
    public String solution(String str1,String str2) {
        String answer = "YES";

        // str1 ,str2 를 배열로 만듬
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        // str1을 key, value 로 맵핑시켜놓기
        HashMap<Character, Integer> map1 = new HashMap<>();
        // str1을 순회하면서 문자열의 빈도 확인후 횟수 증가
        for(int i = 0; i<arr1.length; i++) {
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
        }
        // str2 을 key, value 로 맵핑시켜놓기
        HashMap<Character, Integer> map2 = new HashMap<>();
        // str2을 순회하면서 문자열의 빈도 확인후 횟수 증가
        for(int i = 0; i<arr2.length; i++) {
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }
        // 두 값이 같지 않다면
        if(!map1.equals(map2)) {
            return "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn32 inflearn32 = new Inflearn32();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();       // 첫번 째 문자 입력
        String str2 = scanner.next();       // 두번 째 문자 입력
        System.out.println(inflearn32.solution(str1,str2));
    }
}
