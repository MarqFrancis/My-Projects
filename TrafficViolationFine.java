import javax.swing.JOptionPane;

public class TrafficViolationFine 
{
  public static void main(String[] args) 
    {
        String speedInput = JOptionPane.showInputDialog(null, "Enter the illegal speed in mph:");
        
        int illegalSpeed = Integer.parseInt(speedInput);
        
        int legalLimit = 55;
        
        double baseFine = 100.00;
        double additionalFinePerMph = 10.00;
        
        if (illegalSpeed > legalLimit) 
        {
            int excessSpeed = illegalSpeed - legalLimit;
            double totalFine = baseFine + (excessSpeed * additionalFinePerMph);
            
            JOptionPane.showMessageDialog(null, "Your fine is Php " + totalFine);
        } 
        else 
        {    
            JOptionPane.showMessageDialog(null, "You are within the speed limit. No fine.");
        }
    }
}