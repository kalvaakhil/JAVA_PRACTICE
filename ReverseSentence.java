import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        String ans=reverseWords(s);
        String s=sc.nextLine();
        String ans="";
        StringBuilder temp=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                ans=ans+temp.reverse();
                temp.setLength(0);
            }
            else
            {
                ans+=" ";
                temp.append(c);
            }
        }
        ans+=temp.reverse();
        System.out.println(ans.trim());

    }
}
