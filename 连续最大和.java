
/*
    连续最大和
        一个数组有N个元素，求连续子数组的最大和
        例如 [-1,2,1] 和最大的连续子数组为[2,1] 其和为3
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = n, i = 0;
        while(m-- > 0) {
            arr[i++] = sc.nextInt();
        }
        int maxSoFar = Integer.MIN_VALUE, maxCur = 0;
        for(i = 0; i < n; i++) {
            maxCur = Math.max(maxCur + arr[i], arr[i]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        System.out.println(maxSoFar);
    }
}


