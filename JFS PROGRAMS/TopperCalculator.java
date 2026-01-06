import java.util.Scanner;
public class TopperCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter number of students (N): ");
        int N = sc.nextInt();
        System.out.print("Enter number of subjects (M): ");
        int M = sc.nextInt();

        String[] studentNames = new String[N];   // array to store student names
        int[][] marks = new int[N][M];           // 2D array for marks

        // Input student names and marks
        for (int i = 0; i < N; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.next();

            System.out.println("Enter marks for " + M + " subjects:");
            for (int j = 0; j < M; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate topper based on average
        int topperIndex = 0;
        double maxAverage = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / M;

            if (average > maxAverage) {
                maxAverage = average;
                topperIndex = i;
            }
        }

        // Print topper
        System.out.println("\nTopper: " + studentNames[topperIndex]);
        System.out.printf("Average Marks: %.2f\n", maxAverage);

        sc.close();
    }
}
