public class NthPrime {
    public static void main(String[] args) {
        int n=10;
        int c=0;
        int num=2;
        int primeArray[]=new int[n];
        while(true)
        {
            if(checkPrime(num))
            {
                primeArray[c]=num;
                c++;
            }
            if(c==n)
            {
                System.out.println(num);
                break;
            }
            num++;
        }
//        for(int x:primeArray)
//        {
//            System.out.println(x);
//        }
    }

    private static boolean checkPrime(int num) {

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
