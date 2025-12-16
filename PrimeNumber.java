class PrimeNumber{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int count = 0;
        if(n <= 1)
		{
            System.out.println(" NOT a Prime Number ");
			return;
        }
        for( int i =1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
} 