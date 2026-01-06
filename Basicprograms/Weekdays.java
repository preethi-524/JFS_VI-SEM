import java.util.Scanner;

class WeekDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("your choice is \"" + day + "\" , that day is Monday");
                break;
            case 2:
                System.out.println("your choice is \"" + day + "\" ,  that dayis Tuesday");
                break;
            case 3:
                System.out.println("your choice is \"" + day + "\" , that day is Wednesday");
                break;
            case 4:
                System.out.println("your choice is \"" + day + "\" , that day is Thursday");
                break;
            case 5:
                System.out.println("your choice is \"" + day + "\" , that day is Friday");
                break;
            case 6:
                System.out.println("your choice is \"" + day + "\" , that day is Saturday");
                break;
            case 7:
                System.out.println("your choice is \"" + day + "\" , that day is Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter number between 1 and 7");
        }
    }
}
