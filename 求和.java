
/*
    求和：
        输入两个整数n、m
            从数列1、2、3、4、5、、、n中随意取几个数
            使其和等于m，列出所有的可能的组合
            
    深度优先遍历
*/

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList aList = new ArrayList<Integer>();
            for(int i=1;i<=n;i++){
                aList.add(i);
                count(m, i, i,n,aList);
                aList.remove(aList.size()-1);
            }
        }
    }
    public static void count(int m, int sum, int currentVal, int n, ArrayList aList){
        if(sum>m)return;
        if(sum==m){
            StringBuilder sb = new StringBuilder();
            Iterator it = aList.iterator();
            while(it.hasNext()){
                sb.append(it.next() + " ");
            }
            System.out.println(sb.toString().trim());
        }else{
            for(int i=currentVal+1;i<=n;i++){
                aList.add(i);
                count(m, sum+i, i, n,aList);
                aList.remove(aList.size()-1);
            }
        }
    }
}

