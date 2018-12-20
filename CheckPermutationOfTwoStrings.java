package CrackingCodingInterview.ArraysAndStrings;

import java.util.HashMap;

public class CheckPermutationOfTwoStrings {

    public static boolean checkPermutationOfTwoStrings(String str1, String str2){

        HashMap hashMap1 = new HashMap<Character, Integer>();
        HashMap hashMap2 = new HashMap<Character, Integer>();

        for(char ch : str1.toCharArray()){
            if(hashMap1.containsKey(ch)){
                hashMap1.put(ch, (Integer)hashMap1.get(ch) +1);
            }else{
                hashMap1.put(ch, 1);
            }
        }
        for(char ch : str2.toCharArray()){
            if(hashMap2.containsKey(ch)){
                hashMap2.put(ch, (Integer)hashMap2.get(ch) +1);
            }else{
                hashMap2.put(ch, 1);
            }
        }
        return hashMap1.equals(hashMap2);
    }

    public static void main(String[] args) {
        String s1 = " KAMAL ";
        String s2 = " kamal ";
        String s3 = " KAMAL ";
        System.out.println(checkPermutationOfTwoStrings(s1,s2));
        System.out.println(checkPermutationOfTwoStrings(s1,s3));
    }

}
