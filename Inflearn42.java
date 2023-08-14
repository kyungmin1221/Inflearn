package Inflearn.Inflearn;

// 삽입정렬 //
// 입력 자료가 이미 정렬이 되있을 경우 시간복잡도 - O(N)
// 최악의 경우는 입력 자료가 역으로 정렬된 경우 -  O(N^2)
// 카드를 정렬하는것과 유사 , 정렬이 안 된 부분의 숫자를 하나씩 정렬된 부분의 적절한 위치를 칮아 삽입한다.
// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn42 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<N; i++) {
            int key = A[i];
            int j = i-1;
            while(j >=0 && A[j]>key) {
                A[j + 1] = A[j];
                j -= 1;
            }
            A[j+1] = key;
        }
        for(int s : A) {
            System.out.print(s + " ");
        }
    }
}
