package basics;

public class RemovingTrailingZeros {
	
	public String getString(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!='0')
			{
				return str.substring(0,i+1);
			}
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Akhil000";
		RemovingTrailingZeros removingTrailingZeros=new RemovingTrailingZeros();
		String ans=removingTrailingZeros.getString(str);
		System.out.println(ans);
		

	}

}
