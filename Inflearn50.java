package Inflearn.Inflearn;

// 이분검색(Binary Search)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Inflearn50 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int start = 0;
        int end = A.length-1;

        while(start<=end) {
            int answer = 0;
            int mid = (start+end) / 2;
            if(A[mid] == M ) {
                answer = mid + 1;
                System.out.println(answer);
                break;
            }
            if(A[mid] < M) {
                start = mid + 1;
            }
            else if(A[mid] > M) {
                end = mid - 1;
            }
        }
    }
}
