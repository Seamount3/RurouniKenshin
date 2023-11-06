package 基础算法.two.差分矩阵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 16:13
 * @description:TODO
 */
public class Main {
    static int [][]a;
    static int [][]b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int n,m,q;
        n=Integer.parseInt(s1[0]);
        m=Integer.parseInt(s1[1]);
        q=Integer.parseInt(s1[2]);
        a=new int[n+10][m+10];
        b=new int[n+10][m+10];
        for (int i = 1; i <= n; i++) {
            s = br.readLine();
            s1 = s.split(" ");
            for (int j = 1; j <= m; j++) {
                a[i][j]=Integer.parseInt(s1[j-1]);
                insert(i,j,i,j,a[i][j]);
            }
        }
        for (int i = 0; i < q; i++) {
            s = br.readLine();
            s1 = s.split(" ");
            int x1,y1,x2,y2,v;
            x1=Integer.parseInt(s1[0]);
            y1=Integer.parseInt(s1[1]);
            x2=Integer.parseInt(s1[2]);
            y2=Integer.parseInt(s1[3]);
            v=Integer.parseInt(s1[4]);
            insert(x1,y1,x2,y2,v);
        }
        //求二维前缀和
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m ; j++) {
                b[i][j]+=(b[i][j-1]+b[i-1][j]-b[i-1][j-1]);
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void insert(int x1,int y1,int x2,int y2,int v){
        b[x1][y1]+=v;
        b[x2+1][y1]-=v;
        b[x1][y2+1]-=v;
        b[x2+1][y2+1]+=v;
    }
}
