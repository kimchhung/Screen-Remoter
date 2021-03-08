
import java.net.Socket;

import javax.swing.JOptionPane;

public class Start {
    static String port = "3210";

    public static void main(String args[]) {
        String ip = JOptionPane.showInputDialog("Server IP Address");
        new Start().initialize(ip, Integer.parseInt(port));
    }

    public void initialize(String ip, int port) {
        try {

            Socket sc = new Socket(ip, port);
            System.out.println("Connecting to the Server");
            // Auth class is responsible for security purposes
            Auth frame1 = new Auth(sc);

            frame1.setSize(300, 80);
            frame1.setLocation(500, 300);
            frame1.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
