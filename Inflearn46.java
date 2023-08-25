package Inflearn.Inflearn;

// Least Recently Used(LRU) - 캐시,카카오 변형


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn46 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // 캐시의 크기
        int s = Integer.parseInt(st.nextToken());
        // 작업의 개수
        int n = Integer.parseInt(st.nextToken());
        int[] A = new int[n];

        st = new StringTokenizer(bf.readLine());
        // 작업 번호들을 담을 배열
        for(int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 크기 s의 cashe 배열 선언
        int[] cache = new int[s];
        for(int x : A) {
            int pos = -1;
            // 작업번호가 캐시에 있는 번호와 같다면 히트이므로 pos를 변경 -> 1) else 문으로 이동
            for(int i=0; i<s; i++) {
                if(x == cache[i]) {
                    pos = i;
                }
            }
            // 캐시 미스 상태 일 때
            if(pos == -1) {
                for(int i = s-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
            // 2) 따라서 1) 에서 캐시 히트로 pos를 변경함
            else {
                // 히트인 숫자부분만 뒤로 복사
                for(int i = pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }
        // 정리된 cache 배열 출력
        for(int k : cache) {
            System.out.print(k+ " ");
        }
    }
}
