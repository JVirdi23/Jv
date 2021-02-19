import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Jan 2021
 * 
 *         
 */
public class TheAreaOfCircle {
	
	public static double calcIncrease(double salary, double increaseRate) {

        increaseRate = salary * increaseRate; //calculation.

        return increaseRate; // return the area. 
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // Declare and initalize variables
        double sal, increaseRate, finalSalary;
        //prompt 
        sal = Double.parseDouble(JOptionPane.showInputDialog( null, "Enter your salary."));
        increaseRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the percent increase"));
        while ( 1 < increaseRate || 0 > increaseRate)
        {
            increaseRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a valid percent increase. A decimal number"
                    + " up to 1."));
        }
        //calculate area 
        increaseRate = calcIncrease(sal, increaseRate);
        JOptionPane.showMessageDialog(null, "Your salary increase is  $" + increaseRate);
        finalSalary = increaseRate + sal;
        JOptionPane.showMessageDialog(null, "Your salary is now  $" +  finalSalary);

	}

}
