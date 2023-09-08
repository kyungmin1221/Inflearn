package Inflearn.Inflearn;

// 응급실 //
// 우선순위 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Inflearn_응급실 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         //  5 2
        int N = Integer.parseInt(st.nextToken());
        //  60 50 70 80 90
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            pq.add(A[i]);
        }
        



    }
}
