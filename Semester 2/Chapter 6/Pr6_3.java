public class Pr6_3
{	
	static String blank(int n)
	{
		String space = "";
		for (int i = 0; i <= n; i++)
		{
			space = space + " ";
		}
		return space;
	}
	
	static String stars(int n)
	{
		 String xx = "";
		 for (int i = 0; i < n; i++)
		 {
			 xx = xx + "*";
		 }
		 return xx;
	}
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("how many lines: ");
		IBIO.output("");
		
		for (int i = 1; i<=(n+1); i++)
		{
			IBIO.output(blank(n-i) + stars(n));
		}
		for (int i = n; i>=1; i--)
		{
			IBIO.output(blank(n-i) + stars(n)); 
		}
	}
}
