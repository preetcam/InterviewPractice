package CrackingCodingInterview.ArraysAndStrings;

import java.util.LinkedHashMap;

public class ChangeSpaceWithSpecialChar {
    // Change space with %20

    public static String changeSpace(String str){
        if(str.length()==0){
            return null;
        }
        return str.replaceAll(" ", "%20");
    }

    public static String changeSpaceMethod2(String str){
        if(str.length()==0){
            return null;
        }
        for(int i=0; i<str.length(); i++){
          if(str.charAt(i) == ' '){
              str = str.substring(0,i)+ "%20"+ str.substring(i+1);
          }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "My Name is Kamal";
       // System.out.println(changeSpace(str));

        System.out.println(changeSpaceMethod2(str));
    }
}
