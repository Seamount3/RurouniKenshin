package 基础算法.one.浮点数二分;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author:天才玩家M
 * @date:2023/11/5 9:59
 * @description:求平方根
 */
public class Main {
    public static void main(String[] args) throws IOException {
        double i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        i=Double.valueOf(s);
        one(i,0,i);
        two(i,0,i);
    }
    public static void one(double i,double l,double r){
        double mid=(l+r)/2;;
        while(r-l>1e-10){
            mid=(l+r)/2;
            if(mid*mid>=i)r=mid;
            else l=mid;
        }
        System.out.println(mid);
    }
    public static void two(double i,double l,double r){
        double mid=(l+r)/2;
        for (int j = 0; j <100 ; j++){//利用二分的机制,把区分细分为1/2^100得到结果
           mid=(l+r)/2;
            if(mid*mid>=i)r=mid;
            else l=mid;
        }
        System.out.println(mid);
    }
}
