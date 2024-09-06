import java.util.Scanner;

public class GetCourseNameTest {
    public static void main( String[] args ) {
        Scanner input = new Scanner( System.in );

        GetCourseName myGetCourseName = new GetCourseName();

        System.out.printf( "Initial course name is: %s\n\n",
        myGetCourseName.getCourseName() );

        System.out.println( "Digite o nome do curso: " );
        String theName = input.nextLine();
        myGetCourseName.setCourseName( theName );
        System.out.println();

        myGetCourseName.displayMessage();

        input.close();
    }
}
