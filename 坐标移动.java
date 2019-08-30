
/*
    坐标移动
        开发一个坐标计算工具
            A表示向左移动 D表示向右移动
            W表示向上移动 S表示向下移动
           从（0，0）开始移动 从输入的字符串里面读取一些坐标
           并将最终结果输出到输入文件里面
*/
import java.util.*;
public class Main{
     
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] A=str.split(";");
            int x=0,y=0;
            for(String string:A){
                if(string.charAt(0)=='D' && string.substring(1).matches("[0-9]+"))
                    x+=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='W' && string.substring(1).matches("[0-9]+"))
                    y+=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='S' && string.substring(1).matches("[0-9]+"))
                    y-=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='A' && string.substring(1).matches("[0-9]+"))
                    x-=Integer.parseInt(string.substring(1));
               
            }
            System.out.println(x+","+y);
        }
         
        sc.close();
    }
     
   
}

