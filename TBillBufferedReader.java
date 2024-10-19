import java.io.*;

public class TBillBufferedReader 
{
    public static void main(String [] args) throws Exception 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String customerName;
        byte softdrinksQuantity;
        byte sandwichesQuantity;
        double totalBill;
        
        System.out.print("Please enter your name: ");
        customerName = reader.readLine();

        System.out.print("How many softdrinks would you like to buy: ");
        softdrinksQuantity = Byte.parseByte(reader.readLine());

        System.out.print("How many sandwiches would you like to buy: ");
        sandwichesQuantity = Byte.parseByte(reader.readLine());

        totalBill = (softdrinksQuantity * 15) + (sandwichesQuantity * 20);
        
        System.out.println("Thank you for buying! " + customerName + ", your total bill is: " + totalBill + " PHP");
    }
}