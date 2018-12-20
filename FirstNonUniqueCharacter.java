package CrackingCodingInterview.ArraysAndStrings;
import java.util.HashMap;

// Find first non unique character from String
public class FirstNonUniqueCharacter {

    public static char firstNonUniqueCharacter(String str){
        char ch[] = str.toCharArray();
        HashMap hashMap = new HashMap<Character, Integer>();
        for( char c : ch){
            if (hashMap.containsKey(c)) {
                return c;
            }
            else{
                hashMap.put(c, 1);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s1 = "MAY NAME IS KAMAL";
        System.out.println(firstNonUniqueCharacter(s1));
    }
}
