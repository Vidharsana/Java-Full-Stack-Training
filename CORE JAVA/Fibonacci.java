import java.util.Scanner;
public class Fibonacci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = 0, n2 = 1;
    if(n>0){
       System.out.println(n1 + " ");
    }
    if(n>1){
       System.out.println(n2 + " ");
    }
    for(int i=2;i<n;i++){
        int n3 = n2+ n1;
        System.out.println(n3 + " ");
        n1 = n2;
        n2 = n3;
     }
  }
}
      