import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        // SetPassword frame1 = new SetPassword();
        // frame1.setSize(300, 80);
        // frame1.setLocation(500, 300);
        // frame1.setVisible(true);

        String port = "3210";

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter Pin:");

        String pin = myObj.nextLine(); // Read user input
        System.out.println("Your Pin is: " + pin); // Output user input

        new Serve(Integer.parseInt(port), pin);
    }
}
