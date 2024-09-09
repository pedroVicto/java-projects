public class ConstructCourseNameTest {
    public static void main(String[] args) {
        ConstructCourseName constructCourseName1 = new ConstructCourseName( "Introduction to java programming" );
        ConstructCourseName constructCourseName2 = new ConstructCourseName( "Html, css, javaScript" );

        System.out.printf( "gradebook course name is: \n%s", constructCourseName1.getConstructCourseName() );
        System.out.printf( "gradebook course name is: \n%s", constructCourseName2.getConstructCourseName() );
    }
}
