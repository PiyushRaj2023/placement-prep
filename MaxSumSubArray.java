public class MaxSumSubArray {
    public static void main(String[] args) {
        
        int[] arr = {100, 200, 300, 400};
        int n = arr.length;
        int low = 0;
        int high = 1;
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum = sum + arr[i];
        }

        int res = sum;

        while (high < n) {

            res = Math.max(res, sum);

            low++;
            high++;

            if (high == n) {
                break;
            }

            sum = sum - arr[low - 1];
            sum = sum + arr[high];
        }

        System.out.println(res);
    }
}