import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Japnaam Virdi'
 * Date: Dec. 2020
 * Description: a program which calculates the price of pizza slices and pops 
 * 				using decisions. 
 *
 */
public class Lab3_Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double slices = 0;  
		double pops = 0; 
		double price = 0; 
		double total = 0; 
		double tax = 0; 
		

		// currency format
		NumberFormat money = NumberFormat.getCurrencyInstance ();
		
		// prompt user for the number of pizza slices 
		
		slices = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter number of slices needed."));
		
		// prompt user for the number of pops
	
		pops = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter number of pops needed."));
		
		if (slices < 3) { 
			price = 2.00 * slices + 0.5 * pops; 
		}
		else {
			price = 1.00 * slices + 0.5 * pops; 
		}
		
		tax = price * 0.13; 
		
		total = price + tax; 
		
		JOptionPane.showMessageDialog(null, "Total      " + "\t\t" + money.format(total));
	}
	
		
 
}
