import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = 
        JOptionPane.showInputDialog( "What is your name?: " );

        String message = 
        String.format("Welcome, %s, to java programing!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
