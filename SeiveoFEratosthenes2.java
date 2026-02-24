import java.util.*;
public class SeiveoFEratosthenes2
{
	public static void main(String args[]) 
	{
		int start = 10, end = 50;
		boolean array[] = new boolean[end + 1];
		Arrays.fill(array,true);
		for(int i = 2; i <= Math.sqrt(end); i++) 
		{
			for(j = i*i; j < array.length; j++)
				array[j] = false;
		}
		int counter = 0;
		for(int i = start; i <= end; i++)
		{
			if(array[i] == true)
			{
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("Total Prime numbers:" +counter);	
	}
}