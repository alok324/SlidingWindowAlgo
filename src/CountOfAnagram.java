import java.util.HashMap;
import java.util.Map;

public class CountOfAnagram {
    public static void main(String args[]){
        String InStr="aabaabaa";
        String str="aaba";
        int i=0,j=0, count, ans=0;

        HashMap<Character, Integer> hm= new HashMap<>();

        for(int k=0;k<str.length();k++){
            if(hm.containsKey(str.charAt(k)))
            hm.put(str.charAt(k),hm.get(str.charAt(k))+1);
            else
                hm.put(str.charAt(k),1);
        }
        count=hm.size();
        // traversing through the hashmap
  /*      for(Map.Entry<Character,Integer> e :hm.entrySet())
            System.out.println(e.getKey()+ " : " + e.getValue());*/
            System.out.println("Size of hash mapppppppp - " + count);
        System.out.println("Length of anagram string - " + str.length());

        while(j<InStr.length()){

          //  calculation
            Character temp= InStr.charAt(j);
            if(hm.containsKey(InStr.charAt(j))){
                hm.put(temp,hm.get(temp)-1);
                if(hm.get(temp)==0)
                    count--;
            }
            // loop while anagram length is reached
            if(j<str.length()-1)
                j++;
            // when anagram length is reached
            else {
                // check size of hashmap
                if(count==0)
                    ans++;
                if(hm.containsKey(InStr.charAt(i))){
                    hm.put(InStr.charAt(i), hm.get(InStr.charAt(i))+1);
                    count++;
                }
                i++;
                j++;
            }
        }

        System.out.println("number of anagram string - " + ans);
    }
}
