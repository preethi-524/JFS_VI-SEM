import java.util.Scanner;
class ArrRevNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of numbers: ");
		int n = sc.nextInt();
		int arr[] = new int[n];//memory allocation for array
		System.out.println("Enter " +n + "numbers: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			int num = arr[i];
			int rev = 0;
			while(num > 0)
			{
				int d = num % 10;
				rev = rev * 10 + d;
				num = num / 10;	
			}
			System.out.println("Rev = "+rev);
		}
	}
}
