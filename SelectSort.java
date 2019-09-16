选择排序
思想：
找到所有数中最大值下标
找到最大值的下标与最后一个位置的数值交换位置，这样每次找到的最大值则固定到最后
循环1、2操作直至遍历找到所有
/**
 * 选择排序：找到当前数中最大的数字，找到后与最后一个位置的数字交换位置，直至循环遍历完所有的数为止
 */
private void selectSort() {
    for (int i = 0; i < array.length; i++) {
        // 定义最大数字的下标，默认为0
        int max = 0;
        for (int j = 0; j < array.length - i; j++) {
            // 找到比自己大的数就更新下标
            if (array[max] < array[j]) {
                max = j;
            }
        }
        // 将找到最大的数与最后一个数字交换位置
        int temp = array[array.length - i - 1];
        array[array.length - i - 1] = array[max];
        array[max] = temp;
    }
}

时间复杂度O（n²），但是由于选择排序每轮比较只交换一次，所以实际性能要优于冒泡
