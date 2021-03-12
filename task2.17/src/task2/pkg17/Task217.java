package task2.pkg17;
import java.util.Scanner;
public class Task217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int num1;
       int num2;
       int num3;
       int sum;
       System.out.println("enter first number");
       num1 =input.nextInt();
       System.out.print("enter second number");
        num2 = input.nextInt();
        System.out.println("enter third number");
        num3 = input.nextInt();
        sum = num1 +num2+num3 ;
        System.out.printf("sum is ", sum);
        
        
    }
    
}
