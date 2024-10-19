import java.util.Scanner;

public class TBill
{
    public static void main(String [] args) 
    { 
        Scanner input = new Scanner(System.in);
        
        String customerName;
        byte softdrinksQuantity;
        byte sandwichesQuantity;
        double totalBill; 

        System.out.print("Please enter your name: ");
        customerName = input.nextLine();

        System.out.print("How many softdrinks would you like to buy: ");
        softdrinksQuantity = input.nextByte();

        System.out.print("How many sandwiches would you like to buy: ");
        sandwichesQuantity = input.nextByte();

        totalBill = (softdrinksQuantity * 15.00) + (sandwichesQuantity * 20.00);
        
        input.close();
        System.out.println("Thank you for buying! " + customerName + ", your total bill is: " + totalBill + " PHP");
    }
}
