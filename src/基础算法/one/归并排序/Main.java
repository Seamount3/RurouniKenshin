package 基础算法.one.归并排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/4 22:59
 * @description:TODO
 */
public class Main {
    static int[]arr;
    static int[]temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.valueOf(s);
        arr=new int[n];
        temp=new int[n];
        s = br.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(s1[i]);
        }
        mergeSort(0,n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int l, int r) {
        if(r==l)return;
        int mid=l+(r-l)/2;
        mergeSort(l,mid);
        mergeSort(mid+1,r);
        int i=l;int j=mid+1;int k=i;
        for(;i<=mid&&j<=r;k++){
            int t;
            if(arr[i]<arr[j]){
                t=i++;
            }else{
                t=j++;
            }
            temp[k]=arr[t];
        }
        while (i<=mid)temp[k++]=arr[i++];
        while (j<=r)temp[k++]=arr[j++];
        while (l<=r){
            arr[l]=temp[l];
            l++;
        }

    }
}
