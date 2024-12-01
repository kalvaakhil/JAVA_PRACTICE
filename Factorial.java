//package basics;
//
//public class Factorial {
//	
//	public static int calculateFactrorial(int num)
//	{
//		if(num==0 || num==1)
//		{
//			return 1;
//		}
//		int fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact*=i;
//		}
//		return fact;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num=5;
//		int ans=calculateFactrorial(num);
//		System.out.println(ans);
//
//	}
//
//}
package basics;

public class Factorial {
    
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        long ans = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + ans);
    }
}

