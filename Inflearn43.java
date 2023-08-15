package Inflearn.Inflearn;

// 후위식 연산 //
// 코딩 인터뷰 문제

// 예 : <입력> 352+*9-  <출력> 12
// 후위식계산 =>  5 + 2 = 7 , 7 * 3 = 21 , 21 - 9 = 12

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Inflearn43 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Stack<Integer> stack = new Stack<>();
        // 1. Character.isDigit 을 사용해 문자인지 숫자인지 확인할 수 있습니다
        // 2. true값 일 경우 숫자이며, false값 일 경우 문자입니다
        for(char c  : input.toCharArray()) {
            if(Character.isDigit(c)) {      // c가 숫자일때
                stack.push(c-48);       // 아스키넘버 0 -> 48 -> 53-48 = 5 가 스택에 푸시
            }
            else {                          // c가 문자일 경우
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') {
                    stack.push(lt+rt);
                }
                else if(c == '-') {
                    stack.push(lt-rt);
                }
                else if(c == '*') {
                    stack.push(lt*rt);
                }
                else if(c == '/') {
                    stack.push(lt/rt);
                }
            }
        }                   // stack 에 계산된 결과만 남아있다.
        //  stack 의 첫번째 원소를 변수에 저장 
        int answer = stack.get(0);
        System.out.println(answer);
    }
}
