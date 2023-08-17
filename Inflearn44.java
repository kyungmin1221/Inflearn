package Inflearn.Inflearn;

// 공주 구하기 //

// 큐(Queue)
/*
N이 주어지고 K가 입력되면 K번쨰 숫자가 제외되고, 그 이후로 반복적으로 K번째 수를 제외시킨후 마지막 남은 숫자를 출력
예 ) N = 8 , K =3 이면 -> 4 출력
1 2 3 4 5 6 7 8 -> 1 2 4 5 6 7 8 ..... -> 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Inflearn44 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i=1; i<= N; i++)
        {
            queue.offer(i);
        }
        while(queue.size() > 1) {
            for(int i=1; i<K; i++) {        // 0 , 1 , 2
                queue.offer(queue.poll());
            }
            queue.poll();

        }
        int answer = queue.poll();
        System.out.println(answer);
    }
}
