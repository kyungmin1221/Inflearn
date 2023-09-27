package Inflearn.Inflearn;

// 송아지 찾기 1 (BFS : 상태트리 검색) //

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Inflearn52 {
    static int s,e;
    static int answer =0;
    static int[] dis = {1,-1,5};
    static boolean[] Visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        s = Integer.parseInt(st.nextToken());       // 5
        e = Integer.parseInt(st.nextToken());       // 14

        // 배열 초기화
        // 10,000 번째 인덱스 번호가 필요하므로 +1
        Visited = new boolean[10001];

        System.out.println(BFS(s,e));

    }
    static int BFS(int s,int e) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        Visited[s] = true;
        int num = 0;        // 값을 저장할 변수

        while(!queue.isEmpty()) {
            int len = queue.size();         // 처음 len 은 1로 시작 -> 그 다음은 3 .... 으로 진행
            for(int i=0; i<len; i++) {
                int x = queue.poll();
                if(x == e)  return num;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && !Visited[nx]) {
                        Visited[nx] = true;
                        queue.offer(nx);
                    }
                }    // end for-2 loop
            }   // end for-1 loop
            num ++;     // 해당 트리의 레벨을 다 돌았는데 찾는 값이 없으면 +1 을 해준다.
        }   // end while loop
       return 0;        // 정답은 무조건 존재해야 한다는 문제의 가정 충족
    }   // end BFS()
}
