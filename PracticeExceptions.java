public class PracticeExceptions {
    public static int divide(int a,int b)
    {
        if(b==0)
        {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        try{
            int ans=divide(15,0);
        }
        catch(DivideByZeroException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello");
    }
}
