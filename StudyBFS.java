package Inflearn.Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// BFS 기초 //
/*
<입력>
4 5 1
1 2
1 3
1 4
2 4
3 4
<출력>
-> 1 2 3 4
 */
public class StudyBFS {
    static int n,m,e;
    static int[][] Graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        Graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            Graph[u][v] = Graph[v][u] = 1;
        }
        bfs(Graph,visited,e);
    }

    static void bfs(int[][] Graph, boolean[] visited, int e) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.offer(e);
        visited[e] = true;
       // sb.append(e);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");
            for(int i=1; i<=n; i++) {
                if(Graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
