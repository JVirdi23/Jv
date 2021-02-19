/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Jan 2021
 * 
 *
 */
public class MP3Rating {

	/**
	 * @param args
	 */
	
	public static void displaySignature () {
		  IO.display ("*******************************************\n" 
                  +"ANOTHER WONDERFUL APPLICATION   \n"
                  +"                                \n"
                  +"               By: Japnaam Virdi         \n"
                  +"*******************************************");
	}
	
	public static double computeMP3Rating (int song, int encoding) {
		   double rating; // holds the rating of the mp3 file
		   rating = (song + encoding)/ 2.0; // calculating the mp3 rating with the formula 
		   return rating;
	}
	
	public static int checkInteger (int userInput, int minimum, int maximum) {
		
		while (userInput < minimum || userInput > maximum) { // changed 1..10 to minimum and maximum
			userInput = IO.readInt("\t*** Error. Number must be in range " + minimum + ".." + maximum + ". Please try again.");
		}
		return userInput;
	}
	
	
	public static void main(String[] args) {
		
		int ratingOfSong = 0, qualityOfEncoding = 0; 
        double rating; // keeps the rating of the mp3 file 
        String filename = ""; // holds the nmae of the mp3 file
        
        displaySignature();
        
        IO.display ("This program will compute a rating for an mp3 file.");
        
        // get the file name
        filename = IO.readString("Please enter the name of the mp3 file: ");
        
        // get the song rating
        ratingOfSong = IO.readInt("Enter a rating for the song in " + filename + " (1-10): ");
        
        
        ratingOfSong = checkInteger(ratingOfSong, 1, 10);
        
        // get the MP3 quality rating
        qualityOfEncoding = IO.readInt("Enter a rating for mp3 quality of " + filename + " (1-10): ");
        
        qualityOfEncoding = checkInteger(qualityOfEncoding, 1, 10);
        
        rating = computeMP3Rating(ratingOfSong, qualityOfEncoding);
        
        IO.display(filename + " has an overall rating of: " + rating);
        
        displaySignature();
        
        
	}

	
}
