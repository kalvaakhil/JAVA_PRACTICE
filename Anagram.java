import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean ans=false;
        if(s1.length()==s2.length())
        {
            ans=checkAnagram(s1,s2);
        }
        if(ans){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }

    private static boolean checkAnagram(String s1, String s2) {
        Map<Character,Integer> h1=new HashMap<>();
        Map<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
            char c2=s2.charAt(i);
            h2.put(c2,h2.getOrDefault(c2,0)+1);
        }
        return h1.equals(h2);
    }
}
