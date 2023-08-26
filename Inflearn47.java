package Inflearn.Inflearn;

// 중복된 숫자/확인 //
// 정렬 - O(NLogN)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Inflearn47 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        boolean answer = false;
        Arrays.sort(A);
        for (int i = 0; i < N - 1; i++) {
            if (A[i] == A[i + 1]) {
                answer = true;
                break;
            }
        }
        if(answer) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }
    }
}
