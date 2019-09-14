冒泡排序
思想：
两两比较，如果后者比前者大则交换位置
每遍历一圈最大的数就会冒到最后，则确定了本轮比较中的最大值放到最后不动
循环1、2直至遍历完所有
/**
 * 冒泡排序：两两比较，大者交换位置，则每一圈比较最大的数就会冒到最后，循环直至遍历完所有
 */
private void bubbleSort() {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }   
}

时间复杂度O（n²）
