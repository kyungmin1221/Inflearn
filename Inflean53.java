package Inflearn.Inflearn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflean53 {
    static int n,e,answer = 0;         // 노드(n)와 엣지(e)
    static int[][] Graph;    // 그래프를 표현할 2D 배열
    static boolean[] Visited;   // 방문 배열

    static void DFS(int node) {
        if(node == n) {
            answer++;
        } else {
            for(int i=1; i<=n; i++) {
                if(Graph[node][i] == 1 && !Visited[i]) {
                    Visited[i] = true;
                    DFS(i);
                    Visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        Graph = new int[n+1][n+1];
        Visited = new boolean[n+1];

        for(int i=0; i<e; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 단방향 간선으로 그래프를 설정 / 왔던 길 다시 못감
            Graph[u][v] = 1;
        }

        Visited[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}
