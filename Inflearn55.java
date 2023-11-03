package Inflearn.Inflearn;

// 미로탐색(DFS) //


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Inflearn55 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int answer=0;

    public static int dfs(int x, int y) {
        if(x==7 && y==7) {
            answer++;
        } else {
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] == 0) {
                    board[nx][ny] =1;
                    dfs(nx,ny);
                    board[nx][ny] =0;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        for(int i=1; i<8; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()); // i를 통해 한줄 씩 읽어오므로 i 반복 부분에 넣는것이 맞다
            for(int j=1; j<8; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        board[1][1] = 1;
        System.out.println( dfs(1,1));
    }
}
