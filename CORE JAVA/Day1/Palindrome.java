import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        sc.close();
    }
    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            n = n / 10; // Remove the last digit from the original number
        }
        return originalNumber == reversedNumber;
    }
}
