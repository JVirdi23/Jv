import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Dec 2020
 * Description: Rock-Paper-Scissors game  
 *
 */
public class Lab3_Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int computerChoice;
		computerChoice = (int)(Math.random() * 3 + 1);
		
		// prompt for choice
		int choice = 0; 
		
		choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your choice \n 1 = Rock \n 2 = Paper \n 3 = Scissors"));
		
		if (choice == computerChoice) {
			JOptionPane.showMessageDialog(null, "It was a tie");
		}
		else if (choice == 1 && computerChoice == 3) { 
			JOptionPane.showMessageDialog(null, "You win");
		}
		else if (choice == 2 && computerChoice == 1) { 
			JOptionPane.showMessageDialog(null, "You win");
		}
		else if (choice == 3 && computerChoice == 2) { 
			JOptionPane.showMessageDialog(null, "You win");
		}
		else {
			JOptionPane.showMessageDialog(null, "You lost");
		}
	}

}
