import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class SetZeroes{
    public void setzeroes(int[][] matrix){
        Set<Integer>rowset = new HashSet<>();
        Set<Integer>colset = new HashSet<>();
        for( int i =0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                rowset.add(i);
                colset.add(j); 
                }
            }
        }
        for( int i =0; i <matrix.length; i++){
           for( int j = 0; j < matrix[0].length; j++){
            if(rowset.contains(i) || colset.contains(j)){
                 matrix[i][j]=0;
            }
           } 
        }       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
            int r = sc.nextInt();
        System.out.println("Enter number of columns");
            int c = sc.nextInt();
            int[][]matrix = new int[r][c];
            System.out.println("Enter matrix elements");
            for( int i = 0; i < r; i++){
                for( int j = 0; j < c; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            SetZeroes obj = new SetZeroes();
            obj.setzeroes(matrix);
            System.out.println("Matrix after zeroes: ");
            System.out.println(Arrays.deepToString(matrix));
    }
}

