
/*
    风口的猪——中国牛市
    
        已知一只股票连续n天的价格走势
            以长度为n的整数数组表示
                数组中第i个元素（price[i]）代表该股票第i天的股价
                    假设一开始没有股票    但是有之多两次买入1股或者卖出1股的机会
                        买入前要保证手上没有股票
                            如果两次都放弃，收益为0
                                设计算法，计算能获得的最大收益
*/
public class Solution {
     
    public int calculateMax(int[] prices) {
        if(prices==null || prices.length<2)return 0;
        int sum=0;
        for(int i=1;i<prices.length;i++){
            int temp=getMax(prices,0,i)+getMax(prices,i+1,prices.length-1);
            if(temp>sum)sum=temp;
        }
        return sum;
    }
    public static int getMax(int[] prices,int left,int right){
        if(left>=prices.length)return 0;
        int Min=prices[left];
        int ret=0;
        for(int i=left+1;i<=right;i++){
            Min=Math.min(prices[i],Min);
            ret=Math.max(ret,prices[i]-Min);
        }
        return ret;
    }
}

