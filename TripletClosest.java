import java.util.*;
public class TripletClosest{
    public static void main(String[] args) {
        int[]arr={-1, 2, 1, -4};
        int target=1;
        Arrays.sort(arr);
        
        
        int closest=arr[0]+arr[1]+arr[2];
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];

                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum<target){
                    j++;

                }
                else if(sum>target){
                    k--;
                }
                else{
                    closest= sum;
                    break;
                }


            }

        }System.out.println("closest sum =" + closest);



    }
}