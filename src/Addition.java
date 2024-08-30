import java.util.Scanner;

public class Addition 
{
    public static void main( String[] args ) 
    {
        Scanner scanner = new Scanner(System.in);

        

        System.out.print( "Digite o primeiro número inteiro: " );
         int num1 = scanner.nextInt();

        System.out.print( "Digite o segundo número inteiro: " );
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println( "o valor da some é: " + sum );

        scanner.close();
    } 
}
