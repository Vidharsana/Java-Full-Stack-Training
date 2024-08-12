import java.util.Scanner;
public class Factorial{
  public static void main(String args[]){
    int n = 1;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=2;i<=a;i++){
       n = n * i;
    }
    System.out.println("The factorial of " + a + " is " + n);
  }
}