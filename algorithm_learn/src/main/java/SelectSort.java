/**
 * 选择排序
 * 每一次从待排序的数据元素中选出最小的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
 * @author SIMBA1949
 * @date 2019/5/7 22:46
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 99, 40, 20, 50, 47, 80};
        selectSortFun(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void selectSortFun(int[] arr){
        if (null == arr || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }
}
