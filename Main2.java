import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color; // Importing the Color class

public class Main2 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(450, 450);

        // Set the background color before making the frame visible
        frame.getContentPane().setBackground(new Color(250, 0, 0));

        ImageIcon image = new ImageIcon("image.jpg");
        frame.setIconImage(image.getImage());

        // Set visibility after all configurations
        frame.setVisible(true);
    }
}