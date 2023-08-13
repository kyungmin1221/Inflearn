package Inflearn.Inflearn;

// 버블정렬 //
// time : 112ms
// 시간복잡도 : O(N^2)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn40 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<N-1-i; j++) {
                if(A[j]>A[j+1]) {
                    int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] =temp;
                }
            }
        }
        for(int s : A) {
            System.out.print(s+ " ");
        }
    }
}


// time : 123ms
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Inflearn40 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        int[] A = new int[N];
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        for(int i=0; i<N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        for(int i=0; i<N-1; i++) {
//            boolean change = false;
//            for(int j=0; j<N-1-i; j++) {
//                if(A[j]>A[j+1]) {
//                    int temp = A[j+1];
//                    A[j+1] = A[j];
//                    A[j] =temp;
//                    change = true;
//                }
//            }
//            if(!change) {
//               break;
//            }
//        }
//        for(int s : A) {
//            System.out.print(s+ " ");
//        }
//    }
//}