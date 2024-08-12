import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();   
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    } 
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits); 
            n = n / 10;
        }
        return originalNumber == sum;
    }
}
