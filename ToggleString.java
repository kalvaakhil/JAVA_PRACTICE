public class ToggleString {
    public static void main(String[] args) {
        String s="eLePhaNt";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
//            A-65
            if(c>='A' && c<='Z')
            {
                ans+=(char)(c+32);
            }
//            a-97 diff is 32
            else if(c>='a' && c<='z')
            {
                ans+=(char)(c-32);
            }
            else{
                ans+=c;
            }
        }
        System.out.println(ans);
    }
}
