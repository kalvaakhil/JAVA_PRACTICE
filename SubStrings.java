public class SubStrings {
    public static void main(String[] args) {
        String s="abcde";
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
            for(int j=i+2;j<s.length();j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
