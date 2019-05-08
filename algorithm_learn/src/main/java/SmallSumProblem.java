/**
 * @author SIMBA1949
 * @date 2019/5/8 22:45
 */
public class SmallSumProblem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5};
        System.out.println(smallSumProblemFun(arr, 0, arr.length - 1));
    }

    public static int smallSumProblemFun(int[] arr, int left, int right){
        if(null == arr || arr.length <= 1){
            return 0;
        }
        return mergingSort(arr, 0, arr.length - 1);
    }

    private static int mergingSort(int[] arr, int left, int right) {
        if (left == right){
            return 0;
        }
        int mid = (left + right)/2;
        int leftSmallSum = mergingSort(arr, left, mid);
        int rightSmallSum = mergingSort(arr, mid + 1, right);
        int leftAndRightSmallSum = merge(arr, left, mid, right);
        return  leftSmallSum + rightSmallSum + leftAndRightSmallSum;
    }

    private static int merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        int result = 0;
        while (p1 <= mid && p2 <= right){
            result += arr[p1] < arr[p2] ? (right - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= right){
            help[i++] = arr[p2++];
        }
        for (int n = 0; n < help.length; n++) {
            arr[left + n] = help[n];
        }
        return result;

    }

}
