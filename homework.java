import javax.swing.JOptionPane;

public class homework 
{
   public static void main(String[] args) 
   {
      String choices = "";
      String menuInput = JOptionPane.showInputDialog(
         null, 
         "Menu:\n1. Espresso\n2. Latte\n3. Cappuccino\n4. Mocha\n\nEnter your choice (1-4):", 
         "Coffee Shop Menu", 
         JOptionPane.QUESTION_MESSAGE
      );

      int menu = Integer.parseInt(menuInput);

      switch (menu) {
         case 1: 
            choices = "You chose Espresso. Price: $6.00";
            break;
         case 2: 
            choices = "You chose Latte. Price: $3.75";
            break;
         case 3: 
            choices = "You chose Cappuccino. Price: $2.75";
            break;
         case 4: 
            choices = "You chose Mocha. Price: $1.50";
            break; 
         default: 
            choices = "Invalid choice from the menu.";
            break;
      }

      JOptionPane.showMessageDialog(null, choices, "Your Selection", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Thank you for using this program.", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
   }
}
