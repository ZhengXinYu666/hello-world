
/*
    电话号码
        1
        2--ABC
        3--DEF
        4--GHI
        5--JKL
        6--MNO
        7--PQRS
        8--TUV
        9--WXYZ
        0
            将电话号码设计成自己公司名字相对应
                例如：Help Desk   4357
                    转换成数字形式号码，并去除重复部分
*/
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        //这里我们直接定义两个数组存放我们的原号码和转换之后的号码
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<String> arrayList = new ArrayList<String>();
            //创建一个ArrayList对象
            for(int i=0; i<n; i++){
                String str = sc.next();
                str = str.replace("-","");
                String result="";
                for(int j=0;j<7;j++){
                    result += number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                result=result.substring(0,3)+"-"+result.substring(3,7);
                if(!arrayList.contains(result))
                    arrayList.add(result);
            }
            Collections.sort(arrayList);
            for(int j=0; j<arrayList.size(); j++){
                System.out.println(arrayList.get(j));
            }
            System.out.println();
        }
    }
}

