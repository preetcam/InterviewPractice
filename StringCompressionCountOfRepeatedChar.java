package CrackingCodingInterview.ArraysAndStrings;

import java.util.*;

public class StringCompressionCountOfRepeatedChar {

    // aabcccccaaa a2b1c5a3
    public static String stringCompression(String str) {

        String myStr = "";
        char last = str.charAt(0);
        int count =1;
        for( int i=1; i< str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }else{
                myStr = myStr + last + count;
                last = str.charAt(i);
                count =1;
            }
        }
        return myStr+last+count;
    }

    public static String stringCompressionWithStringBuffer(String str) {

        StringBuffer sb = new StringBuffer();
        int count =0;
        char last = str.charAt(0);

        for(int i=1; i< str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }
            else{
                sb.append(last);
                sb.append(count);
               // sb.append(""+sb +count);
                last = str.charAt(i);
                count= 1;
            }
        }
        sb.append(last);
        sb.append(count);
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "aaabcccccaaa";
        System.out.println("String is "+ s + "   "+stringCompression(s));
        System.out.println("String is "+ s + "   "+stringCompressionWithStringBuffer(s));
    }
}
