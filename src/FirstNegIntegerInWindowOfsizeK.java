import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//Sliding Window
public class FirstNegIntegerInWindowOfsizeK {
    public static void main(String args[]) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3, i = 0, j = 0, count = 0;
        Boolean flag = false;

        ArrayList<Integer> al = new ArrayList<>();

      //  ArrayList<Integer> negNums = new ArrayList<>();
        Queue<Integer> CalQ = new LinkedList<>();

        while (j < arr.length) {

            if (arr[j] < 0)
                CalQ.add(arr[j]);
            // while j is not reaching to window size
            if ( (j -i + 1) <k)
                j++;

            else if (j-i+1==k) {
                if (CalQ.isEmpty())
                    al.add(0);
                else {
                    System.out.println("adding element -  : " + CalQ.peek());
                    al.add(CalQ.peek());

                    if(CalQ.peek()==arr[i]){
                        CalQ.remove();
                    }
                }
                j++;
                i++;
            }

           // System.out.print(al);

        }

        System.out.print(al);
    }
}
