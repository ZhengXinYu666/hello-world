/*
    验证尼科彻斯定理
        任何一个整数m的立方都可以写成m个连续奇数之和
            例如：
                1^3=1
                2^3=3+5
                3^3=7+9+11
                4^3=13+15+17+19
*/
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a= sc.nextInt();
            String res="";
            int begin=0;//奇数的起始值
            if(a%2==1){//中位数为奇数时
                begin=a*a-2*(a/2);
            }else{//中位数为偶数时
                begin=a*a-2*(a/2)+1;
            }
            res+=begin;
            for(int i=1;i<a;i++)
                res+="+"+(begin+2*i);        
            System.out.println(res);          
        }
    }
}
