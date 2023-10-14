public class MaxSumSubArrayOfSizeK {
    public static void main(String args[]){

        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4, sum=0, maxsum=Integer.MIN_VALUE;
        int i=0,j=0;
        System.out.println(arr.length );

        if(arr.length < k)
            System.out.println("Invalid Input");

        while(j< arr.length){
           sum=sum+arr[j];
            if(j-i+1<k)
                j++;
            // window size will always be 'j-i+1'
            else if(j-i+1==k) {
                maxsum = Math.max(sum, maxsum);
                sum=sum-arr[i];
                j++;
                i++;
            }
        }
        System.out.println("MaxSum - " + maxsum);
    }
}
