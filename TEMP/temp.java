import java.util.Scanner;
public class temp {

    static int temp;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int temp = scanner.nextInt();
        if (temp < 0) {
            System.out.println("Freezing weather");
        }else if(temp > 0 && temp <= 10){
            System.out.println("Very Cold Weather");
        }else if(temp > 11 && temp <= 20){
            System.out.println("Cold Weather");
        }else if(temp > 21 && temp <= 30){
            System.out.println("Normal Weather");
        }else if(temp > 31 && temp <= 40){
            System.out.println("It's Hot");
        }else if(temp >= 40){
            System.out.println("It's Very Hot");
        }
    }
}