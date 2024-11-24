package basics;

class SwapNumbers{
	public void swap2Numbers(int ...input)
	{
		if(input.length<2)
		{
			System.out.println("Insufficient Numbers to Swap");
		}
//		Swap for ele greater or equal to 2
		for(int i=0;i<input.length-1;i++)
		{
			int temp=input[i];
			input[i]=input[i+1];
			input[i+1]=temp;
		}
		for(int num: input)
		{
			System.out.println(num);
		}
	}
}

public class BasicPrograms {
	public static void main(String[] args) {
		SwapNumbers swap=new SwapNumbers();
		swap.swap2Numbers(1,2,3);
	}
	
}
