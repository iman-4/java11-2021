public class Pr6_2
{	
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
		int n = IBIO.inputInt("how many lines ");
		for (int i = 1; i <= n; i++)
		{ 
			IBIO.output(stars(i));
		}
		for (int i = n-1; i >= 1; i--)
		{ 
			IBIO.output(stars(i));
		}		
	}
}
