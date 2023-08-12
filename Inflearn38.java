package Inflearn.Inflearn;

// 크레인 인형 뽑기 ( 스택 )  //
// 카카오 기출문제

/*
<입력>
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

<출력>
4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Inflearn38 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());
        int[][] A = new int[N][N];      // N x N 크기의 배열 생성
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int M = Integer.parseInt(bf.readLine());
        int[] moves = new int[M];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for(int pos : moves) {
            for(int i=0; i<A.length; i++) {
                if(A[i][pos-1] != 0) {
                    int box = A[i][pos-1];
                    A[i][pos-1] = 0;
                    if(!stack.isEmpty() && box == stack.peek() ) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(box);
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
