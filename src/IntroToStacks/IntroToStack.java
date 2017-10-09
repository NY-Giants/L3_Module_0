package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	Random randy = new Random();
	String newnum = new String();
	Stack<Double> numbers = new Stack<Double>();
	double f1;
	
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		IntroToStack introstack = new IntroToStack();
		//   Don't forget to import the Stack class
	}
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		IntroToStack(){
			
			newnum = JOptionPane.showInputDialog("Enter a number between 0 and 100");
			double f1 = Double.parseDouble(newnum);
			newnum = JOptionPane.showInputDialog("Enter a number between 0 and 100");
			double f2 = Double.parseDouble(newnum);
			for(int i = 0; i < 100; i++){
				numbers.push(randy.nextDouble()*100);
				
				
				
				
			}	
			for(int i = 0; i < 100; i++){
				double p = numbers.pop();
				if(p >= f1 && p <= f2){
					System.out.println(p);
				}
				
			}

		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
			
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
			
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		//
		//numbers.pop();
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}

