public class FirstOccuredCharacter {
    public static void main(String[] args) {
        String s1="abcbcd";
        for(int i=0;i<s1.length();i++)
        {
            boolean repeated=false;
            for(int j=i+1;j<s1.length();j++)
            {
                if(s1.charAt(j)==s1.charAt(i))
                {
                    repeated=true;
                    break;
                }
            }
            if(repeated==false)
            {
                System.out.println(s1.charAt(i));
                break;
            }
        }
    }
}
