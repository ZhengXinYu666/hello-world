
/*
    木棒拼图
        每个木棒有对应长度
            能后用集合中的这些木棒在某个顺序首位相连构成一个面积大于0的简单多边形
                而且所有木棒都要用上
                    初始集合是空的 有两种操作，要么给集合添加一个长度为L的木棒，那么删除集合中已有的某个木棒
                     每次操作结束后要告知是否能用集合中的木棒构成一个简单多边形。
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long[][] data=new long[n][2];
            for(int i=0;i<n;i++){
                data[i][0]=sc.nextLong();
                data[i][1]=sc.nextLong();
            }
            dealWith(data);
        }
    }
     
    public static void dealWith(long[][] data){
        List<Long> sticks=new ArrayList<Long>();
        for(int i=0;i<data.length;i++){
            if(data[i][0]==1)
                sticks.add(data[i][1]);
            else
                sticks.remove(data[i][1]);
            judge(sticks);
        }
    }
     
    public static void judge(List<Long> sticks){
        if(sticks.size()<3)
            System.out.println("No");
        else{
            Collections.sort(sticks);
            long sum=0;
            int i=0;
            for(i=0;i<sticks.size()-1;i++){
                sum+=sticks.get(i);
            }
            if(sum>sticks.get(i))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

