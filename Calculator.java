import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Enter the operation ");
        String a = sc.next() ;
        switch (a) {
            case "+" :
                System.out.println("The sum of two number is " + (number1 + number2));
                break;

            case "-" :
                System.out.println("The sum of two number is " + (number1 - number2));
                break;

            case "*" :
                System.out.println("The sum of two number is " + (number1 * number2));
                break;

            case "/" :
             if ( number2 != 0){
                System.out.println("The sum of two number is " + (number1 / number2));
             }
             else{
                System.out.println("Cannot be divide by Zero");
             }
                break;
        
            default:
            System.out.println("Select the correct opertaion");
                break;
        }
    }
}