package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String number = JOptionPane.showInputDialog("Give me a number!");
String number2 = JOptionPane.showInputDialog("Give me another number!");
int a = Integer.parseInt(number);
int b = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do to those numbers?", "poop lol rekt fart", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		
		if(operation == 0) {
			add(a,b);
		}
		if(operation == 1) {
			subtract(a,b);
		}
		if(operation == 2) {
			multiply(a,b);
		}
		if(operation == 3) {
			divide(a,b);
		}

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
 

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1, int num2 ) {
	JOptionPane.showMessageDialog(null,num1 + num2);
	// 4. Create similar methods for subtraction, multiplication and division.
}
static void subtract(int sub1, int sub2) {
	JOptionPane.showMessageDialog(null, sub1 - sub2);
}
static void multiply(int mul1,int mul2) {
	JOptionPane.showMessageDialog(null, mul1*mul2);
}
static void divide(int div1,int div2) {
	JOptionPane.showMessageDialog(null, div1/div2);
}

 












}