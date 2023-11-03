package Inflearn.Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로의 최단거리(BFS) //
public class Inflearn56 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    // 2차원 미로 배열
    static int[][] board;
    // 방문 유무를 저장할 배열
    static boolean[][] check;

    // 방문 거리를 저장
    static int[][] dist;

    static void bfs(int x,int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        check[x][y] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll(); // (1,1) -> 출발지점 (포함x)
            for(int i=0; i<4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7) {
                    if(board[nx][ny] !=1 && !check[nx][ny]) {
                        check[nx][ny] = true;
                        dist[nx][ny] = dist[now[0]][now[1]] + 1;
                        queue.add(new int[] {nx,ny});
                    }
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        check = new boolean[8][8];
        dist = new int[8][8];
        for(int i=1; i<8; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=1; j<8; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        board[1][1] = 1;
        check[1][1] = true;
        bfs(1,1);
        if(dist[7][7] == 0 ) {
            System.out.println("-1");
        } else {
            System.out.println(dist[7][7]);
        }
    }
}
