import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int x;
        int y;
        int z;
        int result;

        System.out.print( "Digite um número inteiro: " );
        x = input.nextInt();

        System.out.print( "Digite o segundo número inteiro: " );
        y = input.nextInt();

        System.out.print( "Digite o último número inteiro: " );
        z = input.nextInt();
        
        result = x * y * z;

        System.out.printf( "O produto desse números  são: %d\n", result );

        input.close();
    }
}
