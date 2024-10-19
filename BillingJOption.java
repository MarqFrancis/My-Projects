import javax.swing.JOptionPane;

public class BillingJOption
{
   public static void main (String [] args)
   {
      final double SOFTDRINK = 15.00; //Constant, softdrink price is 15.00
      final double SANDWICH = 20.00;  //Constant, sandwich price is 20.00
      double billTotal, sandwichBill, softdrinkBill; // Declaration of variables for process
      
      String response;
      response = JOptionPane.showInputDialog("Please enter your name");
      String name = response;
      
      //Asks for input for how many drinks will be purchased
      response = JOptionPane.showInputDialog("Please enter the amount of drinks that you will purchase"); 
      byte softdrinkAmmount = Byte.parseByte(response); //Converts input into byte
      softdrinkBill = softdrinkAmmount * SOFTDRINK; //Computes for softdrink bill
      
      //Asks for input for how many sandwiches will be purchased
      response = JOptionPane.showInputDialog("Please enter the amount of sandwiches that you will purchase"); 
      byte sandwichAmmount = Byte.parseByte(response); //Converts input into byte
      sandwichBill = sandwichAmmount * SANDWICH; //Computes for sandwich bill
      
      billTotal = sandwichBill + softdrinkBill; //Computes for total bill
      
      JOptionPane.showMessageDialog(null,"Hello "+ name + ", Your total bill is: " + billTotal); //Output
   }
}