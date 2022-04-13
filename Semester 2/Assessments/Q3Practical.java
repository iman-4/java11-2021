/*
 * Q3Practical.java
 * 
 * Java programming practical test
 * Topic: Arrays, algorithms, problem solving
 * 
 */
import java.util.*;

public class Q3Practical
{	
	public static int max(int[] numbers)
	{
		int max = numbers[0];
		for (int b = 1; b < numbers.length; b++)
		{
			if (numbers[b] > max)
			{
				max = numbers[b];
			}
		}
		return max;
	}
	
	public static int min(int[] numbers)
	{
		int min = numbers[0];
		for (int b = 1; b < numbers.length; b++)
		{
			if (numbers[b] < min)
			{
				min = numbers[b];
			}
		}
		return min;
	}
	
	public static double average(int[] numbers)
	{
		double sum = 0.0;	
		for (int b = 0; b < numbers.length; b++) 
		{
			sum = sum + numbers[b];
		}
		double average = sum/numbers.length;
		return average;
	}
	
	public static int above(int[] numbers)
	{
		int counter = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > average(numbers))
			{
				counter = counter + 1;
			}
		}		
		return counter;
	}
	
	public static int below(int[] numbers)
	{
		int counter = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < average(numbers))
			{
				counter = counter + 1;
			}
		}		
		return counter;
	}
	
	public static boolean isUnique(int[] numbers)
	{
		double result = 0;
		double counter = 0;
		for (int a = 0; a < numbers.length; a++)
		{
			int temp = 0;
			for (int b = 0; b < numbers.length; b++)
			{
				if (numbers[a] == numbers[b])
				{
					temp = temp + 1;
				}
			}
			if (temp > counter)
				{
					counter = temp;
				}
		}
		if (counter == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void printArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]);
			if(i < numbers.length - 1)
			{
				System.out.print(", ");
			}
		}
	}
	
	public static void largest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
	}
	
	public static void smallest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
	}	
	
	
	public static void main (String[] args)
	{	// DO NOT CHANGE THE LINE BELOW v
		final int[] numbers = { 163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317 };

		System.out.println("Iman Khan");
		System.out.print("Amount of numbers (100): " + numbers.length);
		// OUTPUT THE AMOUNT OF NUMBERS IN THE ARRAY HERE -- DON'T JUST output(100)
		
		System.out.println();
		System.out.println();
		printArray(numbers);
		System.out.println();
		System.out.println();
		System.out.println( "Min            (2) = " + min(numbers) );
		System.out.println( "Max          (523) = " + max(numbers) );
		System.out.println( "Average   (235.96) = " + average(numbers) );
		System.out.println( "Above average (48) = " + above(numbers) );
		System.out.println( "Below average (52) = " + below(numbers) );
		System.out.println( "Array has only unique elements (true): " + isUnique(numbers) );
		System.out.println();
		int howMany = inputInt("How many largest and smallest numbers to find in the array: ");
		while (howMany > 20 || howMany < 1)
		{
			howMany = inputInt("Error-enter a number between 1 and 20: ");
		}
		
		largest(numbers, howMany);
		System.out.println();
		smallest(numbers, howMany);
		// the end.
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

