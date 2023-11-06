package 基础算法.two.子矩阵的和;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 10:53
 * @description:TODO
 */
public class Main {
    static int n,m,q;
    static int [][]arr;
    static int [][]ss;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        n=Integer.parseInt(s1[0]);
        m=Integer.parseInt(s1[1]);
        q=Integer.parseInt(s1[2]);
        arr=new int[n+10][m+10];
        ss=new int[n+10][m+10];
        for (int i = 1; i <=n; i++) {
            s = br.readLine();
            s1 = s.split(" ");
            for (int i1 = 1; i1 <= s1.length; i1++) {
                arr[i][i1]=Integer.parseInt(s1[i1-1]);
                ss[i][i1]=ss[i-1][i1]+ss[i][i1-1]-ss[i-1][i1-1]+arr[i][i1];
            }
        }
        int x1,y1,x2,y2;
        for (int i = 0; i < q; i++) {
            s = br.readLine();
            s1 = s.split(" ");
            x1=Integer.parseInt(s1[0]);
            y1=Integer.parseInt(s1[1]);
            x2=Integer.parseInt(s1[2]);
            y2=Integer.parseInt(s1[3]);
            System.out.println(ss[x2][y2]-ss[x1-1][y2]-ss[x2][y1-1]+ss[x1-1][y1-1]);

        }
    }
}
