
/*
    进制转换
        写一个程序，接受一个十六进制的数值字符串
        输出该熟知的十进制字符串
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = in.nextLine();
            System.out.println(Integer.parseInt(str.substring(2),16));
            //str.substring(2)表示去除0x
        }
    }
}

