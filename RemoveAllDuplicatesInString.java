public class RemoveAllDuplicatesInString {
    public static void main(String[] args) {
        boolean arr[]=new boolean[256];
        StringBuilder sb=new StringBuilder();
        String s="programming";
        for(int i=0;i<s.length();i++)
        {
            if(!arr[s.charAt(i)])
            {
                sb.append(s.charAt(i));
                arr[s.charAt(i)]=true;
            }
        }
        System.out.println(sb);
    }
}
