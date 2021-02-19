import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Dec. 2020
 * Descritpion: a program which converts percentage to marks. 
 *
 */
public class Lab3_Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mark = 0;
	
		// prompt user for mark. 
		mark = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter mark as whole number")); 
		
		if (mark > 100 || mark < 0) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
		else if (mark < 50) {
			JOptionPane.showMessageDialog(null, "R");
		}
		else if (mark >= 50 && mark <60) {
			JOptionPane.showMessageDialog(null, "Level 1");
		}
		else if (mark >= 60 && mark <70) {
			JOptionPane.showMessageDialog(null, "Level 2");
		}
		else if (mark >= 70 && mark <80) {
			JOptionPane.showMessageDialog(null, "Level 3");
		}
		else {
			JOptionPane.showMessageDialog(null, "Level 4");
		}
	}

}
