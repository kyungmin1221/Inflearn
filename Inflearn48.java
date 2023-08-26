package Inflearn.Inflearn;

// 장난 꾸러기 //
// 정렬
// 배열.clone() : 배열을 복사해준다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Inflearn48 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        ArrayList<Integer> answer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 A 를 복사한 배열
        // 배열.clone() : 배열을 복사
        int[] cloneA = A.clone();
        // 복사한 배열을 오름차순 정렬
        // 입력 되어있는 배열과 오름차순 되어 있는 배열을 비교하여 숫자가 다른 인덱스번호를 찾는다.
        Arrays.sort(cloneA);
        for(int i=0; i<N; i++) {
            if(A[i] != cloneA[i]) {
                // 인덱스는 0번 부터임, 순서를 찾아야하므로 +1 을 해준다.
                answer.add(i+1);
            }
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
