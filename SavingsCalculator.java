// <Mauricio Salmoran>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/28/2021>, <9:00>, v0.065
import java.util.Scanner; 


public class SavingsCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your 12-Digit account number:");

        String accountNumber = myScanner.nextLine();

        System.out.println("Your Account number is:" + accountNumber);
        System.out.println("Enter your account name: ");
        
        String accountName = myScanner.nextLine();
        
        System.out.print("Enter the opening balance for Account #" + accountNumber);
        System.out.println(".  Do not include $ or , please:");
        int myInt = myScanner.nextInt();
        
        System.out.print("Enter the current interest rate in percentage format.");
        System.out.println(".  Do not include the % please:");


        double myDouble = myScanner.nextDouble();
        
        
    }
}