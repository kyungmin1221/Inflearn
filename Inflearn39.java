package Inflearn.Inflearn;

// 선택정렬 //
// 오름차순
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn39 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N-1; i++) {
            int least = i;
            for(int j=i+1; j<N; j++) {
                if(A[j] < A[least]) {
                    least = j;
                }
            }
            int temp = A[least];
            A[least] = A[i];
            A[i] = temp;
        }
        for(int s : A) {
            System.out.print(s + " ");
        }
    }
}