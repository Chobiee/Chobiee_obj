import java.util.Scanner;

public class Laboratory1 {
    static int Laboratory1; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 90) {
            System.out.println("You got an A!");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("You got an B!");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("You got an C!");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("You got an D!");
        } else {
            System.out.println("You got an F!");
        }
    }
}