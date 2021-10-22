// <Mauricio Salmoran>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <8:43>, v0.056
import java.util.Scanner; 


public class SavingsCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your 12-Digit account number:");

        String accountNumber = myScanner.nextLine();

        System.out.println("Your Account number is:" + accountNumber);

        System.out.println("Enter your account name: ");

        int myInt = myScanner.nextInt();
        double myDouble = myScanner.nextDouble();
        
        
    }
}