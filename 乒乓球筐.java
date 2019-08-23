
/*
    乒乓球筐
        两盒乒乓球A、B
            红双喜+亚里亚
                判断A中是否包含了B中的所有的种类
                    每个乒乓球用一个大写字母表示（相同的为相同字母）
                    并且每种球的数量不少于B盒中的数量
*/
import java.util.*;
public class Main{
public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while(read.hasNextLine()) {
            String r = read.nextLine();
            String[] boxs = r.split(" ");
            ArrayList<Character> A = new ArrayList<Character>();
            ArrayList<Character> B = new ArrayList<Character>();
            for(int i = 0; i < boxs[0].length(); i++) {
                A.add(boxs[0].charAt(i));
            }
            for(int i = 0; i < boxs[1].length(); i++) {
                B.add(boxs[1].charAt(i));
            }
            for(int i = 0; i < B.size(); i++) {
                if(A.contains(B.get(i))) {
                    A.remove(A.get(A.indexOf(B.get(i))));
                    B.remove(i);
                    i--;
                }
            }
            if(B.size() == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            A = null;
            B = null;
        }
    }
}

