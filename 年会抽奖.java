
/*
    年会抽奖
        抽奖规矩：
            1、每个人将自己的名字的字条放到箱子—
            2、每人从中取出一个字条
            3、如果抽到自己的名字——————中奖
            告诉了参会人数，计算有多少概率出现无人获奖
        
        我们现在来想一下这个问题
        假设有5个人，不放回的抽
        第一个人五种抽法，第二个人四种，第三个人三种，第四个人两种，第五个人一种
        所以一共的可能性有25种
        当n个编号元素放在n个编号位置，元素编号与位置编号各不对应的方法数用D(n)表示，
        那么D(n-1)就表示n-1个编号元素放在n-1个编号位置，各不对应的方法数，其它类推.
        第一步，把第n个元素放在一个位置，比如位置k，一共有n-1种方法；
        第二步，放编号为k的元素，这时有两种情况：把它放到位置n，那么，对于剩下的n-1个元素，
        由于第k个元素放到了位置n，剩下n-2个元素就有D(n-2)种方法；
        第k个元素不把它放到位置n，这时，对于这n-1个元素，有D(n-1)种方法；
        综上得到递推公式，可以发现可以用递归来做；
        D(n) = (n-1) [D(n-2) + D(n-1)]
        特殊地，D(1) = 0, D(2) = 1.
        那么D(5)=4*[D(3)+D(4)]；依次求得D(3)、D(4),最后D(5)=44
        所以5个人拿不到奖的概率就是44/120=36.67%
*/

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        // 输入
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); // 代表测试数据的组数
            float sum1 = factorial(n);
            float sum2 = count(n);
            //将得到的分子分母进行相除，就可以得到概率了。
            float result1 = (sum2/sum1)*100;
            System.out.println(String.format("%.2f", result1) + "%");
        }
         
    }
// 错排算法
    public static float count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
         
    }
    //n的阶乘
     public static float factorial(int num) {
            float result = 1;
            if(num==0){
                return 1;
            }else if (num > 0) {
                result = num * factorial(num - 1);
            }
            return result;
        }
}

