/**
 * @author SIMBA1949
 * @date 2019/5/8 21:32
 */
public class RecursiveFun {
    public static void main(String[] args) {
        int[] arr = {1, 4, 99, 39, 200, 49, 20, 2};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }

    /**
     * 使用递归获取数组中最大值
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int getMax(int[] arr, int left, int right){

        if(left == right){
            return arr[left];
        }

        int mid = (left + right)/2;
        int leftMax = getMax(arr, left, mid);
        int rightMax = getMax(arr, mid + 1, right);

        return Math.max(leftMax,rightMax);
    }
}
