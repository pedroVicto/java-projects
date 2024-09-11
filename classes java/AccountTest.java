import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00 );
        Account account2 = new Account( -7.53 );

        System.out.printf( "account1 balance: $%.2f \n", 
            account1.getBalance() );
        
        System.out.printf( "acount2 balance: $%.2f \n\n", 
        account2.getBalance() );

        Scanner input = new Scanner( System.in );
        double depositAmount;

        System.out.print( "Enter deposit Amount for account1: " );
        depositAmount = input.nextDouble();

        System.out.printf( "\nAdding %.2f  o Account1 Balance\n\n",
            depositAmount );
        account1.credit( depositAmount );

        System.out.printf( "Account1 Balance: $%.2f \n", 
            account1.getBalance() );

        System.out.printf( "Account2 Balance: $%.2f \n",
            account2.getBalance() );

        System.out.print( "Enter deposit Amount for Account2: " );
        depositAmount = input.nextDouble();

        System.out.printf( "\nAdding $%.2f  o Account2 Balance\n\n", 
            depositAmount );
        account2.credit( depositAmount );

        System.out.printf( "Account1 Balance: $%.2f \n", 
            account1.getBalance() );

        System.out.printf( "Account2 Balance: $%.2f \n",
            account2.getBalance() );

        
        input.close();
    }
}
