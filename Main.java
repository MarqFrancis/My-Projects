import java.util.*;

public class Main 
{
    public static void main(String [] args) 
    {
       Scanner input =  new Scanner(System.in);

        System.out.print("Enter your grades: ");
        int grade = input.nextInt();

        if (grade == 100) {
            System.out.println("Your grade is: A+");
        }

        else if (grade >= 90 && grade <= 99) {
            System.out.println("Your grade is: A");
        }

        else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is: B");
        }

        else {
            System.out.println("Your grade is below B. You failed!");
        }
        input.close();
    }
}