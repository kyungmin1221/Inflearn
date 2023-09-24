package Inflearn.Inflearn;

// 재귀함수 연습 //

public class Inflean_Recursion {
    static int[] fibo;
    private int DFS(int n) {
        if(n == 1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        Inflean_Recursion rctest = new Inflean_Recursion();
        int n = 45;
        fibo = new int[n+1];
        rctest.DFS(n);
        for(int i=1; i<n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
