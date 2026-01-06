import java.util.Scanner;
class Multiplicationtable
{
    public static void main (String[]args){
     Scanner sc= new Scanner(System.in);
     System.out.println("which table you want ?: ");
     int num = sc.nextInt();
     for (int i = 1; i <= 10 ; i++){
        System.out.println(num + "*" + i + " = " + (num * i));
     }    
}
}