import javax.swing.*;

public class TBillJOptionPane
{
    public static void main(String [] args) 
    {
        String customerName;
        byte softdrinksQuantity;
        byte sandwichesQuantity;
        double totalBill;
    
        customerName = JOptionPane.showInputDialog("Please enter your name: ");

        softdrinksQuantity = Byte.parseByte(JOptionPane.showInputDialog(null, "How many softdrinks would you like to buy? ")); 

        sandwichesQuantity = Byte.parseByte(JOptionPane.showInputDialog(null, "How many sandwiches would you like to buy? "));  

        totalBill = (softdrinksQuantity * 15.00) + (sandwichesQuantity * 20.00);

        JOptionPane.showMessageDialog(null, "Thank you for buying, " + customerName + "!\n" +
                "Your total bill is: " + totalBill + " PHP");
    }
}