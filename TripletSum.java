import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            // i ka duplicate skip
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {

                    System.out.println(
                        arr[i] + " " + arr[j] + " " + arr[k]
                    );

                    j++;
                    k--;

                    // j ka duplicate skip
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    // k ka duplicate skip
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }

                } 
                else if (sum < 0) {

                    j++;

                } 
                else {

                    k--;
                }
            }
        }
    }
} 
    

