package fabonnaci;
import java.util.Scanner;

public class Fabonnaci {
	public static void main(String args[]) { 
		
		 Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int maxNumber = input.nextInt();

         int previousNumber = 1;

         int nextNumber = 1;

         System.out.print("Fibonacci Series of "+maxNumber+" numbers :");



         for (int i = 1; i <= maxNumber; ++i)

         {

             System.out.print(previousNumber+" ");

            



             int sum = previousNumber + nextNumber;

             previousNumber = nextNumber;

             nextNumber = sum;



 }
	

}
}


