import java.util.Scanner;

public class Laboratory2 {
    static int Laboratory2; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of Apples ");
        int apples = scanner.nextInt();

        if (apples >= 10) {
            System.out.println("No way, that's too much");
        } else if (apples >= 5) {
            System.out.println("No, ask for more");
        } else {
            System.out.println("Okay, sure");
 }
    }
}

