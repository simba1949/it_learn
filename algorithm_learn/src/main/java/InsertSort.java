/**
 * 插入排序
 * 原理：
 * 时间复杂度：
 *      最好情况：O(N)
 *      最差情况：O(N * N)
 *      平均情况：
 *      插入排序时间复杂度按照最差情况分析
 * @author SIMBA1949
 * @date 2019/5/7 23:02
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {99, 40, 88, 2, 39, 41, 0, 3, 4, 3};
        insertSortFun(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }
    public static void insertSortFun(int[] arr){
        if (null == arr || arr.length < 2){
            return;
        }
        // 第一个for循环控制循环区域
        for (int i = 1; i < arr.length; i++){
            for (int j = i - 1; j >= 0; j--){
                // 从小到大排序
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
                // 从大到小排序
//                if (arr[j] > arr[j + 1]){
//                    swap(arr, j, j + 1);
//                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
