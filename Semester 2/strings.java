// slightly modified and expanded
public class strings
{
	static String stars(int n)
	{ String xx = "";
		for (int i = 0; i < n; i++)
		xx = xx + "*";
		return xx;
	} 
 
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter number of lines ");
		for (int i=0; i<num; i++)
		{
			IBIO.output(stars(i+1));
		}
	}
}

