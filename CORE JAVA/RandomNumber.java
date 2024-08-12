import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound + 1);
        
        System.out.println("Random number between 0 and " + upperBound + " is " + randomNumber);
    }
}
