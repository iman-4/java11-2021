public class password
{
	
	public static void main (String[] args)
	{
		String guessMe = "y";
		char[] letters = new char[26];
		int i = 0;
		for (char c = 'a'; c<= 'z'; c++)
		{
			letters [i] = c;
			i++;
		}
		
		char x = guessMe.charAt(0);
		for(int n = 0; n < letters.length; n++)
		{
			if(letters[n] == x)
			{
				System.out.print(">>>" + letters[n]);
				break;
			}
		}
	}
}

