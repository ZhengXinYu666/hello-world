
/*
    查找兄弟单词
        实现一个可存储若干个单词的词典
            用户可以：
                1、在字典中加入单词
                2、查找指定单词在字典中的兄弟单词个数
                3、查找指定单词的指定序号的兄弟查单词
                4、清空字典中所有的单词
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();
            String[] s = new String[num];
            int count = 0;
            for(int i = 0;i<num;i++){
                s[i] = in.next();
            }
            String key = in.next();
            char[] keyChar = key.toCharArray();
            Arrays.sort(keyChar);
            int no = in.nextInt();//第几个
            ArrayList<String> list = new ArrayList<String>();
            for(int i = 0;i<num;i++){
                int c = check(key,s[i],keyChar);
                count += c;
                if(c==1)
                    list.add(s[i]);
            }
            System.out.println(count);
            Collections.sort(list);
            if(count>=no)
                System.out.println(list.get(no-1));
        }
    }
    private static int check(String key,String word,char[] keyChar){
        if(key.equals(word)||key.length()!=word.length())
            return 0;
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(keyChar, wordChar)?1:0;
    }
}

