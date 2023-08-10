package Inflearn.Inflearn;

// 올바른 괄호 //
// 스택
// 후입선출

/*
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력한다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
<입력>
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
<출력>
첫 번째 줄에 YES 또는 NO를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Inflearn36 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        for(char x : input.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            }
            else {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if(answer && stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
