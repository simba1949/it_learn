/**
 * 冒泡排序
 * 原理：在一组数据中，相邻元素依次比较大小，最大的放后面，再重复操作，直到最小放在数组第一位
 * @author SIMBA1949
 * @date 2019/5/7 22:21
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 9, 20, 30, 55, 1, 3, 2, 2};
        bubbleSortFun(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void bubbleSortFun(int[] array){
        if (null == array || array.length < 2){
            return;
        }
        for(int region = array.length - 1; region > 0; region--){
            for (int i = 0; i < region; i++){
                if(array[i] > array[i+1]){
                    // 如果前一个比后一个大，则交换位置
                    swap(array, i, i+1);
                }
            }
        }
    }

    /**
     * 数据交换
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
