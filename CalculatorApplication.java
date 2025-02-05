import java.util.Scanner;

public class CalculatorApplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number::");
        int Number1 = sc.nextInt();

        System.out.print("Enter the Number::");
        int Number2 = sc.nextInt();

        System.out.print("Enter the Operator (+, -, *, /)::");
        char Operator = sc.next().charAt(0);  

        int result = 0; 

        switch (Operator) {
            case '+':
                result = Number1 + Number2;
                break;
            case '-':
                result = Number1 - Number2;
                break;
            case '*':
                result = Number1 * Number2;
                break;
            case '/':
                if (Number2 == 0) {
                    System.out.println("Division By Zero Is Not Possible.");
                    return; 
                } else {
                    result = Number1 / Number2;
                }
                break;
            default:
                System.out.println("Invalid Operator, Please check the operator.");
                return; 
        }

        System.out.print("The Result Is::" + result);
    }
}
