/**
 * Author: Campos
 * Date: April, 2020
 * Description: Rates the quality of an mp3 file
 *
 **/

public class MP3_Rating_Not_Modular
{ 
    public static void main (String[] args) throws InterruptedException
    {
        // variables
        int ratingOfSong = 0, qualityOfEncoding = 0; // hold user input
        double rating; // holds the rating of the mp3 file
        String filename; // holds the name of the mp3 file
        
        // display a signature
        IO.display ("*******************************************\n"
                        +"ANOTHER WONDERFUL APPLICATION   \n"
                        +"                                \n"
                        +"               By: Tony Campos         \n"
                        +"*******************************************");
        
        // display a description        
        IO.display ("This program will compute a rating for an mp3 file.");
        
        // get the file name
        filename = IO.readString("Please enter the name of the mp3 file: ");
        
        // get the song rating
        ratingOfSong = IO.readInt("Enter a rating for the song in " + filename + " (1-10): ");
        
        // keep asking if not within the range
        while (ratingOfSong < 1 || ratingOfSong > 10) 
        {
            ratingOfSong = IO.readInt(" \t*** Error. Number must be in range 1..10. Please try again.");
        }
        
        // call the method to display the signature 
        displaySignature();
        
  
        // get the MP3 quality rating
        qualityOfEncoding = IO.readInt("Enter a rating for mp3 quality of " + filename + " (1-10): ");
        
        // keep asking if not within the range
        while (qualityOfEncoding < 1 || qualityOfEncoding > 10)
        {
            qualityOfEncoding = IO.readInt("\t*** Error. Number must be in range 1..10. Please try again.");
            
        }
        
        // compute and display the overall mp3 rating
        rating = (ratingOfSong + qualityOfEncoding) / 2.0;
        IO.display(filename + " has an overall rating of: " + rating);
        
        // display a signature
        IO.display ("*******************************************\n"
                        +"ANOTHER WONDERFUL APPLICATION   \n"
                        +"                                \n"
                        +"               By: Tony Campos         \n"
                        +"*******************************************");
    } // main method

	private static void displaySignature() {
		
		
		
	}
    
} // MP3_Rating_Not_Modular


