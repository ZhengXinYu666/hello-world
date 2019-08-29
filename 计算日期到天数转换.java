
/*
    计算日期到天数转换
        根据输入的日期，计算是这一年的第几天
        输入三行，分别是年、月、日
        输入是第几天
*/
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        while(sc.hasNext()){
            int year = sc.nextInt() ;
            int month = sc.nextInt() ;
            int day = sc.nextInt() ;
            int Day = outDay(year, month, day) ;
            System.out.println(Day);
        }
        sc.close();
 
    }
 
    private static int outDay(int year, int month, int day) {
        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
            return -1;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            Day[1] = 29 ;
        }
         
        int sum = 0 ;
        for(int i = 0 ; i < month - 1 ; i ++){
            sum += Day[i] ;
        }
        return sum + day;
    }
 
}



import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int year=input.nextInt();
            int month=input.nextInt();
            int day=input.nextInt();
            System.out.println(isOutDay(year,month,day));
        }
    }
    public static int isOutDay(int a1, int a2, int a3){
        int[] reiNian={31,29,31,30,31,30,31,31,30,31,30,31};  //闰年
        int[] p={31,28,31,30,31,30,31,31,30,31,30,31};   //正常年
        String s=String.valueOf(a1);
        if(s.length()!=4 || a2>12 || a3>31)
            return 0;
        int count=0;
        if((a1%4==0 && a1%100!=0)||(a1%400==0 && a1%100!=0)){
            for(int i=0; i<a2-1; i++)
                count+=reiNian[i];
            count+=a3;
        }else{
            for(int i=0; i<a2-1; i++)
                count+=p[i];
            count+=a3;
        }
        return count;
    }
}

