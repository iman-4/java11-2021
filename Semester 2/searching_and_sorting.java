import java.util.*;
import java.io.*;

public class searching_and_sorting
{
	public static void main (String args[])
	{
		int[] scores = new int[6];
		System.out.println("Enter scores for 6 students:");
			for (int i = 0; i < 6; i++)
			{
				scores[i] = inputInt();
			}

		System.out.println("All the Scores:");
			for (int i = 0; i < 6; i++)
			{
				System.out.print(scores[i]);
				if(i < scores.length - 1)
				{
					System.out.print(", ");
				}
			} 
		System.out.println();
		
		// Linear or Sequential Search: search for the item element by element.
		//If the item is found, stop the search.
		
		int x = inputInt("Search for: "); 
		int k = 0;
		
		for (int i = 0; i < scores.length; i++)
		{
			if (scores[i] == x)
			{
				System.out.println("element found at index number" + i);
				k = 1;
			}					
		}
		if (k==0)
		{
			System.out.println("Item not found in the array");
		}
		
		/*
		Binary search:
        -----------------
        1. calculate the mid point of the array
        2. check if the item to be searched is at the mid point
        3. if yes, then stop the search
        4. else, check if the item to be searched is greater than the mid point?
        5. if yes, then shift only to the right part of the array
        6. else shift to the left part of the array
        7. repeat step 1 to 6		
		*/
	}



















	
	/*****************************************************************************
	 * ALL IBIO methods are below, you may use them if you want.				 *
	 * Because they are already inside our clas, there is no need to prefix IBIO.*
	 * before the name of the method.											 *
	 ****************************************************************************/
	 
	static void output (String info)
	{	System.out.println(info);	}
	
	static void out (String info)
	{	System.out.print(info);	}
	
	static void output (char info)
	{	System.out.println(info);	}
	
	static void out (char info)
	{	System.out.print(info);	}
	
	static void output (byte info)
	{	System.out.println(info);	}
	
	static void output (int info)
	{	System.out.println(info);	}
	
	static void out (int info)
	{	System.out.print(info);	}
	
	static void output (long info)
	{	System.out.println(info);	}
	
	static void out (long info)
	{	System.out.print(info);	}
	
	static void output (double info)
	{	System.out.println(info);	}
	
	static void output (boolean info)
	{	System.out.println(info);	}
	
	static String input(String prompt)
	{	String	inputLine = "";
		System.out.print(prompt);
		try
		{	inputLine = (new java.io.BufferedReader(
							new java.io.InputStreamReader(System.in))).readLine();}
		catch (Exception e)
		{	String	err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return	inputLine;
	}
		
	static String inputString(String prompt)
	{	return	input(prompt);	}

	static String input()
	{	return	input("");	}


	static char inputChar(String prompt)
	{	char	result = (char) 0;
		try
		{	result = input(prompt).charAt(0);}
		catch (Exception e)	{	result = (char) 0;}
		return	result;
	}

	static byte inputByte(String prompt)
	{	byte	result = 0;
		try
		{	result = Byte.valueOf(input(prompt).trim()).byteValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static byte inputByte()
	{	return	inputByte("");	}

	static int inputInt(String prompt)
	{	int	result = 0;
		try
		{	result = Integer.valueOf(input(prompt).trim()).intValue() ;	}
		catch (Exception e)	{	System.out.println(">>> error in input"); result = 0;}
		return	result;
	}

	static int inputInt()
	{	return	inputInt("");
	}
	
	static long inputLong(String prompt)
	{	long	result = 0;
		try
		{	result = Long.valueOf(input(prompt).trim()).longValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static long inputLong()
	{	return	inputLong("");	}
	
	static double inputDouble(String prompt)
	{	double	result = 0;
		try
		{	result = Double.valueOf(input(prompt).trim()).doubleValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static double inputDouble()
	{	return	inputDouble("");	}
	
	static boolean inputBoolean(String prompt)
	{	boolean	result = false;
		try
		{	result = Boolean.valueOf(input(prompt).trim()).booleanValue() ;	}
		catch (Exception e)	{	result = false;}
		return	result;
	}

	static boolean inputBoolean()
	{	return	inputBoolean("");
	}
	
}


