import java.util.Scanner;

public class JAVA_PROJECT_PRELIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) for the days of the week: ");
        int day = scanner.nextInt();

        // 3Using if-else if statements to check the day range
        if (day < 1) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else if (day > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            System.out.println("You entered a valid number: " + day);
        }

        // Using switch statement for specific days
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miyerkules");
                break;
            case 4:
                System.out.println("Huwebes");
                break;
            case 5:
                System.out.println("Biyernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Linggo");
                break;
            default:
                // This will not be reached because of previous checks
                System.out.println("Error: This should not happen.");
                break;
        }

        scanner.close();
    }
}
