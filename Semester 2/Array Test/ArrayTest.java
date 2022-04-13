/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArrayTest
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length; // modify
		return result;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		for (int b = 1; b < array.length; b++)
		{
			if (array[b] < min)
			{
				min = array[b];
			}
		}
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		for (int b = 1; b < array.length; b++)
		{
			if (array[b] > max)
			{
				max = array[b];
			}
		}
		return max;
	}
	//------------------------------------------------------------------

	public static double range(double[] array)
	{
		double result = max(array)-min(array); 
		return result;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double sum = 0.0;	
		for (int b = 0; b < array.length; b++) 
		{
			sum = sum + array[b];
		}
		double result = sum/array.length;
		return result;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double result = 0;
		Arrays.sort(array);
		if (array.length % 2 == 0) //even
		{
			int mid1 = array.length/2;
			int mid2 = mid1-1;
			result = (array[mid1] + array[mid2])/2;
		} 
		else //odd
		{
			int mid = array.length/2;
			result = array[mid];
		}
		return result;
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double result = 0;
		double counter = 0;
		for (int a = 0; a < array.length; a++)
		{
			int temp = 0;
			for (int b = 0; b < array.length; b++)
			{
				if (array[a] == array[b])
				{
					temp = temp + 1;
				}
			}
			if (temp > counter)
				{
					counter = temp;
					result = array[a];
				}
		}
		return result;
	}
	//------------------------------------------------------------------
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("Iman Khan");
		System.out.println("Singapore Rainfall Statistics");
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.printf( "Range   (765.7): %.2f\n", range(rainfall) );
		System.out.printf( "Average(178.89): %.2f\n", average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println();
		
		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.println( "Minimum  (25.4): " + min(temperature) );
		System.out.println( "Maximum  (29.5): " + max(temperature) );
		System.out.printf( "Range     (4.1): %.2f\n", range(temperature) );
		System.out.printf( "Average (27.62): %.2f\n", average(temperature) );
		System.out.println( "Mode     (27.3): " + mode(temperature) );
		System.out.println( "Median   (27.7): " + median(temperature) );

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


