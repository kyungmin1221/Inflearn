package Inflearn.Inflearn;

// 경로탐색(DFS) //
// 재귀함수
// 백트래킹
// ..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn53 {
    static int n, m;
    static int answer = 0;
    static int[][] Graph;
    static boolean[] Visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        Graph = new int[n + 1][n + 1];
        Visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            Graph[u][v] = 1;
        }

        Visited[1] = true;
       //  dfs(1); // v==1
        System.out.println(dfs(1));

    }
    // 내가 찾는 것은 n번 정점까지 가는 경로들을 찾는것
    // 즉 방문한 마지막 노드가 n 번이면 문제를 만족한다는 것

    static int dfs(int v) {

        if(v==n) {  // (2) v=5 로 n 과 같아짐 , answer++ 하고 종료 -> 전에 dfs(5)를 호출한 곳으로 복귀(재귀)
            answer++;
        } else {
            for(int i=1; i<=n; i++) {   // (4) dfs(3) 으로 돌아오고 dfs(3) 에서는 Visited 배열을 만족하는게 없으므로 dfs(2) (i=2) 였을때로 복귀
                                        // i=2 이후로 for문 다시 실행 -> i=5 에서 또 조건 만족 -> if(v==n) 을 만족 ->answer++ -> 이러한 순서로 진행
                if(Graph[v][i] == 1 && Visited[i]==false) {
                    Visited[i] = true;
                    // 재귀함수를 호출했던 지점 //
                    dfs(i);     // (1) 마지막에 dfs(5) 실행
                    Visited[i] = false;
                    /*
                      (3) dfs(4) 의 i=5 가 마지막 함수 실행이였으니 다음 for문 실행할게 없다
                            -> Visited[i] = false; 실행, 즉 Visited[5]=false; 하고 Visited[4]=false;
                     */
                }
            }
        }
        return answer;
    }
}
