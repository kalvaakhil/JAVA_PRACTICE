package basics;

class EvenOrOdd{
	public boolean checkEvenOrOdd(int a)
	{
//		if(a%2==0)
//		{
//			return true;
//		}
//		return false;
		
//		method 2
		if((a&1)==0)
		{
			return true;
		}
		return false;
	}
}
class AmstrongNumber{
	public boolean checkAmstrong(int a)
	{
		ReverseNumber reverseNumber=new ReverseNumber();
		int c=reverseNumber.count(a);
		int temp=a;
		int ans=0;
		while(temp>0)
		{
			int dig=temp%10;
			int pow=(int)Math.pow(dig,c);
			ans+=pow;
			temp/=10;
		}
		return a==ans?true:false;
		
	}
}
class ReverseNumber{
	public int reverse(int num)
	{
		int temp=num;
		int ans=0;
		while(temp>0)
		{
			int dig=temp%10;
			ans=ans*10+dig;
			temp/=10;
		}
		return ans;
	}
	public int count(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
    public static int countDigits(int num) {
        if (num == 0) return 0;
        return 1 + countDigits(num / 10);
    }
}

public class EvenOrOddAndAmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd evenOrOdd= new EvenOrOdd();
//		boolean ans1=evenOrOdd.checkEvenOrOdd(5);
//		boolean ans2=evenOrOdd.checkEvenOrOdd(6);
//		System.out.println(ans1?"Even":"Odd");
//		System.err.println(ans2?"Even":"Odd");
		AmstrongNumber amstrongNumber=new AmstrongNumber();
		System.out.println(amstrongNumber.checkAmstrong(153)?"Amstrong":"Not Amstrong");

	}

}
