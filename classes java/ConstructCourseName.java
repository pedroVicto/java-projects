public class ConstructCourseName {
    private String courseName;

    public ConstructCourseName( String name ) {
        courseName = name;
    }

    public void setConstructCourseName( String name ) {
        courseName = name;
    }

    public String getConstructCourseName() {
        return courseName;
    }

    public void  displayMessage() {
        System.out.printf( "Welcome to GradeBook for\n%s!\n", 
        getConstructCourseName() );
    }
}