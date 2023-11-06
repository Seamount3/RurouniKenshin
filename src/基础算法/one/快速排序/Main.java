package 基础算法.one.快速排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author:天才玩家M
 * @date:2023/11/4 22:07
 * @description:TODO
 */
public class Main {
    static int[]arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.valueOf(s);
        arr=new int[n];
        s = br.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(s1[i]);
        }
        quickSort(0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int l,int r){
        if(l==r)return;//死规的原因还可能在这
        int x=arr[(l+r)/2];int i=l-1;int j=r+1;
        while(i<j){
            while (arr[++i]<x);
            while(arr[--j]>x);
            if(i<j){//预防上面的两个while在类似"12345",而x=3时,他们发生了2,4互换,1,5互换
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        quickSort(l,j);
        quickSort(j+1,r);
    }
}
