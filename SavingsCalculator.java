// <Mauricio Salmoran>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/26/2021>, <9:00>, v0.06
import java.util.Scanner; 


public class SavingsCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your 12-Digit account number:");

        String accountNumber = myScanner.nextLine();

        System.out.println("Your Account number is:" + accountNumber);
        System.out.println("Enter your account name: ");
        
        String accountName = myScanner.nextLine();
        System.out.print(accountName );
        System.out.println(" Enter the opening balance for Account #" + accountNumber);

        int myInt = myScanner.nextInt();
        double myDouble = myScanner.nextDouble();
        
        
    }
}