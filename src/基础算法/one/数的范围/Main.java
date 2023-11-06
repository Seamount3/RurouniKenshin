package 基础算法.one.数的范围;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 9:35
 * @description:TODO
 */
public class Main {
    static int []arr;
    public static void main(String[] args) throws IOException {
        int n,q;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        n=Integer.parseInt(s1[0]);
        q=Integer.parseInt(s1[1]);
        arr=new int[n];
        s=br.readLine();
        s1=s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            arr[i]=Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < q; i++) {
            s=br.readLine();
            int x = Integer.parseInt(s);
            int left = getLeft(x, 0, n - 1);
            if(arr[left]!=x){
                System.out.println("-1 -1");
            }else{
                System.out.println(left+" "+getRight(x,0,n-1));
            }
        }
    }
    public static int getLeft(int x,int l,int r){

        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]>=x){//check
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static int getRight(int x,int l,int r){

        while(l<r){
            int mid=(l+r+1)/2;
            if(arr[mid]<=x){
                l=mid;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
}
