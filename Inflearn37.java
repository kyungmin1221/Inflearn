package Inflearn.Inflearn;

// 괄호문자 제거 //
// 스택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성
<입력>
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
<출력>
남은 문자만 출력한다.

 */
public class Inflearn37 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for(char x : input.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '(');
            }
            else {
                stack.push(x);
            }
        }
        for(int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        System.out.println(answer);
    }
}
