import java.util.Scanner;

public class MaxSumSubArrayOfSizeKBF {
    public static void main(String args[]){

        int arr[]={2, 3};
        int k=4, sum=0, maxsum=Integer.MIN_VALUE;

        System.out.println(maxsum);

        if(arr.length < k)
            System.out.println("Invalid Input");
    //Consider all blocks starting with i, we have to iterate with widow size of k for outer loop.
        for (int i=0;i<=arr.length-k;i++){
            sum=0;
            for (int j=i;j<i+k;j++)
            {
                // calculation
                sum=sum+arr[j];
            }
            System.out.println("sum of each window - " + sum);
            /*if(sum>maxsum)
                maxsum=sum;*/
            maxsum=Math.max(sum, maxsum);
        }
        System.out.println(maxsum);
    }
}
