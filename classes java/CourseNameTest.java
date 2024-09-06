import java.util.Scanner;

public class CourseNameTest 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner( System.in );

        CourseName myCourseName = new CourseName();

        System.out.println( "Digite o nome do curso: " );
        String nameOfCourse = input.nextLine();
        System.out.println();

        myCourseName.displayMessage( nameOfCourse );

        input.close();

    }   
}
