package 基础算法.two.差分;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 11:19
 * @description:TODO
 */
public class Main {
    static int []b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        b=new int[n+10];
        int m=Integer.parseInt(s1[1]);
        s = br.readLine();
        s1 = s.split(" ");
        for (int i = 1; i <= s1.length; i++) {
            insert(i,i,Integer.parseInt(s1[i-1]));
        }
        int l,r,c;
        for (int i = 0; i < m; i++) {
            s = br.readLine();
            s1 = s.split(" ");
            l=Integer.parseInt(s1[0]);
            r=Integer.parseInt(s1[1]);
            c=Integer.parseInt(s1[2]);
            insert(l,r,c);
        }
        for (int i = 1; i <=n ; i++) {
            b[i]+=b[i-1];
            System.out.print(b[i]+" ");
        }
    }
    public static void insert(int l,int r,int v){
        b[l]+=v;
        b[r+1]-=v;
    }
}
