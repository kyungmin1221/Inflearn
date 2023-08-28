package Inflearn.Inflearn;

// 좌표정렬 //

// Comparable 사용
// a - b 가 음수이면 오름차순 정렬을 의미한다. 즉 , a b ... ~~

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class MyComparable implements Comparable<MyComparable> {
    public int x,y;
    MyComparable(int x,int y) {
        this.x = x;
        this.y= y;
    }
    @Override
    public int compareTo(MyComparable o) {
        if(this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class Inflearn49 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        ArrayList<MyComparable> A = new ArrayList<>();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A.add(new MyComparable(x,y));
        }
        Collections.sort(A);
        for(MyComparable o : A) {
            System.out.println(o.x + " " +o.y);
        }
    }
}


// 좌표정렬 //

// Comparator 사용
// a - b 가 음수이면 오름차순 정렬을 의미한다. 즉 , a b ... ~~


//class MyComparator{
//    public int x,y;
//    MyComparator(int x,int y) {
//        this.x = x;
//        this.y= y;
//    }
//    public String toString() {
//        return x + " " + y;
//    }
//}
//
//public class Inflearn49 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bf.readLine());
//        List<MyComparator> A = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(bf.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            A.add(new MyComparator(x, y));
//        }
//
//        Collections.sort(A, new Comparator<MyComparator>() {
//            @Override
//            public int compare(MyComparator o1, MyComparator o2) {
//                if (o1.x == o2.x) {
//                    return o1.y - o2.y;
//                }
//                return o1.x - o2.x;
//            }
//        });
//        for (MyComparator o : A) {
//            System.out.println(o);
//        }
//    }
//}
