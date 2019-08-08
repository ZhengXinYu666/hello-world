搜狐员工小王最近利用假期在外地旅游，在某个小镇碰到一个马戏团表演，精彩的表演结束后发现团长正和大伙在帐篷前激烈讨论，小王打听了下了解到，马戏团正打算出一个新节目“最高罗汉塔”，即马戏团员叠罗汉表演。考虑到安全因素，要求叠罗汉过程中，站在某个人肩上的人应该既比自己矮又比自己瘦，或相等。想要本次节目中的罗汉塔叠的最高，由于人数众多，正在头疼如何安排人员的问题。小王觉得这个问题很简单，于是统计了参与最高罗汉塔表演的所有团员的身高体重，并且很快找到叠最高罗汉塔的人员序列。现在你手上也拿到了这样一份身高体重表，请找出可以叠出的最高罗汉塔的高度，这份表中马戏团员依次编号为1到N.
/**
 * 搜狐01-马戏团
 * 变形的最长上升子序列，加入了多关键字，需要自己先排序确定好要考察的顺序
 * 题意理解很重要，只有两种情况才可以叠在一起
 * 1.当体重不一样时，上面的身高要小于等于下面的身高
 * 2.当体重一样时，上面的身高要等于下面的身高
 *
 * 一种思路：我们按照体重为主序从小到大排序
 * 然后对于相同的体重，我们让身高的高在本次体重的最前面
 * 原因：因为我们动态规划里的判断条件只判断身高条件，且只要{0, i - 1}的身高比i的身高小于等于
 * 那么高度就加一，但是这样会造成体重情况的两人，由于第一个人的身高比第二人低，所以就会叠，但是这样是不合法。
 * 所以我们让相同体重的人，最高在前面，这时当两个人体重相同时，结合我们动态规划时的条件，只能身高一样才成立（对应合法的第二种）！
 * 而体重不一样，也就是上面的体重小于下面人的体重时，我们只需确保下面的人的身高大于等于上面的身高即可叠
 *
 * 我上面用的是递增求法，也可以递减
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){ 
            int N = in.nextInt();
            int[][] a = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int m = getResult(N, a);
            System.out.println(m);
        }
    }
    private static int getResult(int N, int[][] a) {
        // TODO Auto-generated method stub
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i][1] < a[j][1]) {
                    int b = a[i][1];
                    a[i][1] = a[j][1];
                    a[j][1] = b;
                    int c = a[i][2];
                    a[i][2] = a[j][2];
                    a[j][2] = c;
                } else if (a[i][1] == a[j][1] && a[i][2] > a[j][2]) {
                    int b = a[i][1];
                    a[i][1] = a[j][1];
                    a[j][1] = b;
                    int c = a[i][2];
                    a[i][2] = a[j][2];
                    a[j][2] = c;
                }
            }
        }
        int count[] = new int[N];
        for (int i = 0; i < N; i++) {
            count[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j][2] >= a[i][2] && count[j] + 1 > count[i])
                    count[i] = count[j] + 1;
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }
        return max;
    }
}

