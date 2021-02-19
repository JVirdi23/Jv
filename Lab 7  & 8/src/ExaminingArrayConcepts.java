import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Jan 2021.
 * Decription: A program which shows the  price of the car and the year it was manufactured  
 *
 */
public class ExaminingArrayConcepts { 


	/**
	 * @param args
	 */
	public static int findCar(String[] carNames, String findCar) {
		// loop through my array to find the search key 
		for (int i = 0; i <= carNames.length-1; i++) {
			// check if the searchKey is equal to the name in the array at i 
			if (carNames[i].equalsIgnoreCase(findCar)) {
				return i; // return the location index 

			}
		}
		return -1;				
	}

	public static void main(String[] args) throws IOException {
		// beginning of try and catch of error
		try {
			//declares the arrays 
			String carNames [];
			double carPrices [];
			int carYears[];
			int sizeName = 0;
			int sizePrices = 0;
			int sizeYears = 0;

			// currency format 
			NumberFormat money = NumberFormat.getCurrencyInstance ();
			String fileName1 = "";
			String fileName2 = "";
			String fileName3 = "";

			fileName1 = JOptionPane.showInputDialog("Please Enter The File Name", "carnames.txt");
			fileName2 = JOptionPane.showInputDialog("Please Enter The File Name", "years.txt");
			fileName3 = JOptionPane.showInputDialog("Please Enter The File Name", "prices.txt");
			// open the file to read
			FileReader fileR = new FileReader(fileName1);
			BufferedReader input = new BufferedReader(fileR);

			// open the file to read
			FileReader fileR1 = new FileReader(fileName2);
			BufferedReader input1 = new BufferedReader(fileR1);

			// open the file to read
			FileReader fileR2 = new FileReader(fileName3);
			BufferedReader input2 = new BufferedReader(fileR2);

			//Getting the array size from the files
			sizeName = Integer.parseInt (input.readLine());
			sizePrices = Integer.parseInt (input1.readLine());
			sizeYears = Integer.parseInt (input2.readLine());

			// create the arrays 
			carNames = new String [sizeName];
			carYears = new int [sizePrices];
			carPrices  = new double [sizeYears];

			// loop for loading the information into the arrays
			for (int i = 0; i <= carNames.length-1; i = i + 1) {
				// prompt for the names and prices and year for each car
				carNames [i] = input.readLine();
			}

			// loop for loading the information into the arrays
			for (int i = 0; i <= carYears.length-1; i = i + 1) {
				// prompt for the names and prices and year for each car
				carYears [i] = Integer.parseInt( input1.readLine());
			}

			// loop for loading the information into the arrays
			for (int i = 0; i <= carPrices.length-1; i = i + 1) {
				// prompt for the names and prices and year for each car
				carPrices [i] = Double.parseDouble(input2.readLine());

			}

			// close the file
			fileR.close();
			fileR1.close();
			fileR2.close();

			// create my output list 
			String list = "Names\t Years\t  Prices\n";
			list = list + "=====\t =====\t  =====\n";

			// for loop to add the names of the car and the price of it onto a list 
			for (int i = 0; i <= carNames.length-1; i = i + 1) {
				list = list + carNames[i] + "\t" + carYears[i] + "\t" + money.format(carPrices[i]) + "                          \n";
			}

			// create a text area for displaying 
			JTextArea outputArea = new JTextArea();
			Font font = new Font("Segoe Script", Font.BOLD, 20);

			// add list to the output area and sets the font
			outputArea.setText(list);
			outputArea.setFont(font);
			// make the area not editable and set the tabs larger
			outputArea.setEditable(false);
			outputArea.setTabSize(15);

			// display the output area in a dialog box
			JOptionPane.showMessageDialog(null, outputArea);

			// create a formatted file and output our information to it
			FileWriter fileW = new FileWriter ("car-list-formatted.txt");
			PrintWriter output = new PrintWriter(fileW);

			// loop to write the information from the arrays to the file
			for(int i = 0; i <= carNames.length-1; i = i + 1) {
				output.println("Name: " + carNames[i] + " Year: " + carYears[i] + " Price: " +  money.format(carPrices[i]));
			}

			fileW.close();

			// Tell the user that you saved the file
			JOptionPane.showMessageDialog(null, "Your file has been saved");

			String findCar = JOptionPane.showInputDialog(null, "Please enter the name of the car");



			//declare a variable for my location where the name is found 
			int location = findCar(carNames,findCar);

			// check if findCar is found 
			if (location < 0) {  
				JOptionPane.showMessageDialog(null, findCar + " is not found!"); 
			}
			else {
				JOptionPane.showMessageDialog(null, findCar + " Price is " +  " $" + carPrices[location]);

			}

			// (Lowest to Highest & Alphabetical order) 
			// loop for elements 
			for(int i = 0; i < carPrices.length-1; i++) {
				// loop through the array elements 
				for(int j = 0; j < carPrices.length-1; j++) {
					// check if the elements are out of order 
					if (carPrices[j] > carPrices[j+1]) {

						double Prices;
						Prices = carPrices[j];
						carPrices[j] = carPrices[j+1];
						carPrices[j+1] = Prices;

						int Years;
						Years = carYears[j];
						carYears[j] = carYears[j+1];
						carYears[j+1] = Years;


						String Cars;
						Cars = carNames[j];
						carNames[j] = carNames[j+1];
						carNames[j+1] = Cars;

					} //end if 

				} // end j loop
			} // end i loop

			// create my output list to display later
			list = "Sorted by price, lowest to highest\n";
			list += "Names\t Years\t Prices\n";
			list = list + "=====\t =====\t  =====\n";

			// for loop to add the car names and price of the cars in the list above
			for (int i = 0; i <= carNames.length-1; i = i + 1) {
				list = list + carNames[i] + "\t" +carYears[i] +"\t" + carPrices[i] + "\n";
			}

			// add list to the output area
			outputArea.setText(list);

			// make the area not editable and set the tabs larger
			outputArea.setEditable(false);
			outputArea.setTabSize(15);

			// display the output area in a dialog box
			JOptionPane.showMessageDialog(null, outputArea);

			// (Lowest to highest) 
			// loop for elements 
			for(int i = 0; i < carPrices.length-1; i++) {
				// loop through the array elements 
				for(int j = 0; j < carPrices.length-1; j++) {
					// hint given by Samandeep Singh Virdi ahahahahahaha
					if (carNames[j].compareTo(carNames[j+1]) > 0) {

						double Prices;
						Prices = carPrices[j];
						carPrices[j] = carPrices[j+1];
						carPrices[j+1] = Prices;

						int Years;
						Years = carYears[j];
						carYears[j] = carYears[j+1];
						carYears[j+1] = Years;


						String Cars;
						Cars = carNames[j];
						carNames[j] = carNames[j+1];
						carNames[j+1] = Cars;

					} //end if 

				} // end j loop
			} // end i loop

			// create my output list to display later
			list = "Sorted Alphabetically \n";
			list += "Names\t Years\t Prices\n";
			list = list + "=====\t =====\t  =====\n";

			// for loop to add the car names and price of the cars in the list above
			for (int i = 0; i <= carNames.length-1; i = i + 1) {
				list = list + carNames[i] + "\t" +carYears[i] +"\t" + carPrices[i] + "\n";
			}

			// add list to the output area
			outputArea.setText(list);

			// make the area not editable and set the tabs larger
			outputArea.setEditable(false);
			outputArea.setTabSize(15);

			// display the output area in a dialog box
			JOptionPane.showMessageDialog(null, outputArea);

		}
		// Error thrown when file is not found
		catch (FileNotFoundException e) {
			IO.display("File Was Not Found!");
		}
		// Error thrown for any other type
		catch (Exception e) {
			IO.display("Error Check Console!");
			System.out.println (e.getMessage());

		}
	}

}
