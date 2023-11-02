package Inflearn.Inflearn;

// 그래프 최단거리(BFS) //
/*
<입력>
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
<출력>
2:3
3:1
4:1
5:2
6:2
 */

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Inflearn54 {
    static ArrayList<ArrayList<Integer>> graph;
    static int n,m;     // 6 9

    // 방문배열
    static boolean[] visited;
    // 최단거리를 저장할 배열
    static int[] dis;

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int find : graph.get(current)) {
                if(!visited[find]) {
                    visited[find] = true;
                    dis[find] = dis[current] + 1;
                    queue.offer(find);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Integer>>();

        // 실수 //
        // int i=1 부터 헸었는데, 생각해보면 visited,dis 배열 모두
        // 인덱스 번호를 1 부터 시작하기위해 n+1 한 크기의 배열이다.
        // 그러므로 list의 크기를 맞춰줘야 한다.
        for(int i=0; i<=n; i++) {
            // ArrayList 에 n 만큼의 비어있는 공간 할당
            graph.add(new ArrayList<Integer>());
        }
        visited = new boolean[n+1];
        dis = new int[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // u 인덱스에 v를 저장
            graph.get(u).add(v);
        }

        bfs(1);
        for(int i=2; i<=n; i++) {
            System.out.println(i + " : " +dis[i]);
        }
    }
}




















