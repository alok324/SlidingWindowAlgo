import java.util.ArrayList;
// BruteForce
public class FirstNegIntegerInWindowOfSizeKBF {
    public static void main(String args[]){
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3, count=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<arr.length-k+1;i++){
            count=0;
            for (int j=i;j<i+k;j++){
                if(arr[j]<0) {
                    al.add(arr[j]);
                    count=count+1;
                    break ;
                }
                    else if(j==i+k-1 && count ==0)
                al.add(0);
            }
        }
        System.out.println(al);
    }
}
