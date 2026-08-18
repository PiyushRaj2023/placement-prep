import java.util.Arrays;

public class TripletSmallerSum {

    public static void main(String[] args) {

        int[] arr = {-2, 0, 1, 3};
        int target = 2;

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < target) {

                    count += k - j;
                    j++;

                } else {

                    k--;
                }
            }
        }

        System.out.println("Count = " + count);
    }
}