package 基础算法.two.前缀和;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 10:35
 * @description:TODO
 */
public class Main {
    static int []arr;
    static int []su;
    public static void main(String[] args) throws IOException {
        int n,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        n=Integer.parseInt(s1[0]);
        m=Integer.parseInt(s1[1]);
        arr=new int[n+10];
        su=new int[n+10];
        s = br.readLine();
        s1 = s.split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i]=Integer.parseInt(s1[i-1]);
            su[i]=su[i-1]+arr[i];
        }
        for (int i = 0; i < m; i++) {
            s= br.readLine();
            s1=s.split(" ");
            System.out.println(su[Integer.parseInt(s1[1])]-su[Integer.parseInt(s1[0])-1]);
        }
    }
}
