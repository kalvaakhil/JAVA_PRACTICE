public class SwitchPractice {
    public static void main(String[] args) {
        int n=5;
        String val=switch(n)
        {
            case  1-> "1";
            case 2->"2";
            case 5->" ITS 5";
            default -> "5";
        };
        System.out.println(val);
        n=9;
        switch (n)
        {
            case 1:{
                System.out.println(n+n);
            }
            case 2:{
                System.out.println(n++);
            }
            default:  System.out.println(n);
        }
    }
}
