import javax.swing.*;

public class ParkingFine
{
    public static void main(String [] args)
    {
        double total;
        final double type_a = 100.0;
        final double type_b = 200.0;
        final double type_c = 300.0;
        final double type_d = 500.0;
        short aN, bN, cN, dN;

        aN = Short.parseShort(JOptionPane.showInputDialog(null, "Enter number of Type A violations: "));
        bN = Short.parseShort(JOptionPane.showInputDialog(null, "Enter number of Type B violations: "));
        cN = Short.parseShort(JOptionPane.showInputDialog(null, "Enter number of Type C violations: "));
        dN = Short.parseShort(JOptionPane.showInputDialog(null, "Enter number of Type D violations: "));

        total = (double) (aN * type_a) + (bN * type_b) + (cN * type_c) + (dN * type_d);

        JOptionPane.showMessageDialog(null, "Total fine is: $ "  + total);

    }
}