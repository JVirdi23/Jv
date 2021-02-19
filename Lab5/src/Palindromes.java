import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Jan 2020
 * Description: a program that uses palindromes to pick the words written 
 * 				forwards or backwards.
 *
 */
public class Palindromes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare and initalize variables. 
        int  len;
        String text = "", reverse = "";
        //Prompt the user. 
        Scanner Inputx = new Scanner (System.in);
        System.out.println("Please enter a word.");
        text = Inputx.nextLine();


        //get the length of user phrase.

        len = text.length();

        //start ordering the letters starting from the one at the very end. 
        for (int i = len - 1; i>= 0; i--) {
            //Each time add 1 letter to reverse for everytime the loop is run.
            reverse = reverse + text.charAt(i);

        }
        //display reverse quote.
        System.out.println( reverse);

        // CHECK IF PHRASE/WORD IS A PALINDROME
        //First remove all spaces.
        String x = text.replaceAll(" ", "");
        String reverse2 = reverse.replaceAll(" ", "");
        //Change everything to capital letters. 
        String x2 = x.toLowerCase();
        String reverse3 =reverse2.toLowerCase();

        String x3 = x2.replaceAll("[^a-zA-Z^]", "");
        String reverse4 = reverse3.replaceAll("[^a-zA-Z^]", "");


        if (x3.equals(reverse4)) {
            System.out.println("The string is a palindrome");

        }
        else {
            System.out.println("Not palindrome");
       }
	}
}
