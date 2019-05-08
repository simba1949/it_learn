/**
 * @author SIMBA1949
 * @date 2019/5/8 22:11
 */
public class MergingSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 56, 299, 467, 1, 9, 550, 20};
        sortProcess(arr, 0, arr.length - 1);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void sortProcess(int[] arr, int left, int right){
        if (left == right){
            return;
        }

//        int mid = left + ((right - left) >> 1);
        int mid = (left + right)/2;
        sortProcess(arr, left, mid);
        sortProcess(arr, mid + 1, right);
        mergingSortFun(arr, left, mid, right);
    }

    public static void mergingSortFun(int[] arr, int left, int mid, int right){
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right){
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 有一个数组越界
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= right){
            help[i++] = arr[p2++];
        }
        for (int k = 0; k < help.length; k++) {
            arr[left + k] = help[k];
        }
    }
}
