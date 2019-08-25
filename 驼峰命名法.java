
/*
        驼峰命名法
        除首个单词外，所有的单词的首字母大写
*/
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] words = str.split("_");
            //分割字符串，遇到_分开
            String result = words[0];
            for(int i=1; i<words.length; i++){
                result += (char)(words[i].charAt(0)-'a'+'A');
                for(int j=1; j<words[i].length(); j++){
                    result += words[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}

