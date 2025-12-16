class Factorial{
public static void main(String arg[]){
  int n= Integer.parseInt(arg[0]);
  int result=1;
  for( int i = 1; i<=n;i++){
    result = result*i;
  }
  System.out.println(" factorial of "+n+"="+result);
  System.out.printf("\nfactorial of %d = %d",n,result);
}
}
