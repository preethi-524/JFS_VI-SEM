import java.util.Scanner;
class 	TestProgram
{
	public static void main(String args[])
	{
	String bin_s = "111110001";
	int ans = Integer.parseInt(bin_s,2);
	System.out.println("bin_string:"+bin_s + " \tDecimal : "+ans);
	String oct_s = "12";
	ans = Integer.parseInt(oct_s,8);
	System.out.println("oct_string:"+oct_s + " \tDecimal : "+ans);
	String hex_s = "12A";
	ans = Integer.parseInt(hex_s,16);
	System.out.println("hex_String:"+hex_s + " \tDecimal : "+ans);
	String dec_s = "12";
	ans = Integer.parseInt(dec_s,10);
	System.out.println("Dec_string: " +dec_s + " \tDecimal : "+ans);
	System.out.println("Enter a binary string : ");
	Scanner sc = new Scanner(System.in);
	bin_s = sc.next();
	int dec_ans = Integer.parseInt(bin_s,2);
	System.out.println("bin_string: "+bin_s + "\tDecimal : "+dec_ans);
	}	
}