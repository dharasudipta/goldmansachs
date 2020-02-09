import java.util.*;
class Solution{
    public static String getSimplifiedString(String inputString){
        String simplifiedString = "";
        // Hash map cant hold duplicate keys
        // Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a3b5c4d1a2”.
        // to store a3 and a2 as differenrt keys we cant use hash map
        // updated solution
        //HashMap<Character,Integer> characterCount=new HashMap<Character,Integer>();
        int count=1;
        int i;
        for (i=1;i<inputString.length();i++){
            if (inputString.charAt(i)!=inputString.charAt(i-1)){
                //characterCount.put(inputString.charAt(i-1), count);
            	simplifiedString = simplifiedString + inputString.charAt(i-1) + count;
                count=1;
            }
            else{
                count++;
            }
        }
        //characterCount.put(inputString.charAt(inputString.length()-1), count);
        simplifiedString = simplifiedString + inputString.charAt(i-1) + count;
        //for (char i:characterCount.keySet()){
        //     simplifiedString=simplifiedString+i+characterCount.get(i);
        //}
        return simplifiedString;
    }
    public static void main(String args[]){
        String inputString="aaaabbbbbbcccddddd";
        System.out.println(getSimplifiedString(inputString));
    }
}