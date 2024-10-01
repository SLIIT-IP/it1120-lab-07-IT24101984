import java.util.Scanner;
public class IT24101984Lab7Q3 {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

double totalDiscount ;
final int discount = 95;
double lastAmount;
char paymentType;
double totalBill;
int customerCount;

	//Bill for 5 customors
	for(customerCount = 1; customerCount <=5; customerCount++) {
		System.out.println("Customer " + customerCount);
		System.out.print("Enter total bill amount : ");
		totalBill = input.nextDouble();

		

	//Get mode of payment type until user input valid payment type
	do {

 	System.out.print("Enter mode of payment ('C' for cash, 'O' for other) : ");
	paymentType = input.next().charAt(0);

		if (paymentType != 'C' && paymentType != 'c' && paymentType != 'O' && paymentType != 'o' ) {
			System.out.println("Payment Mode is not Valid");
			}	

	  }while (paymentType != 'C' && paymentType != 'c' && paymentType != 'O' && paymentType != 'o' );

		//Vailidate the payment method
		if (paymentType == 'C' || paymentType == 'c') {
			totalDiscount = totalBill * 5 / 100;
			lastAmount = totalBill * discount / 100;
			System.out.println("Discount is : " + totalDiscount);
			System.out.println("Amount to be paid : " + lastAmount);
		   }

		  else if (paymentType == 'O' || paymentType == 'o') {
			System.out.println("No discount applicable");
			System.out.println("Amount to be paid : " + totalBill);

		   }
		
		
		
		System.out.print("\n");


	}



   }
}



