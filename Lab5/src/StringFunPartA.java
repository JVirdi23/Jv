/**
 * 
 */

/**
 * @author Japnaam Virdi
 * Date: Jan 2020
 *
 */
public class StringFunPartA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "I'm too cool for this stuff, Mr. Campos!";
        String output;
        int len;
        int counter = 0;

        
        len = text.length(); // counts how many characters are in the original text
        System.out.println(len);

        System.out.println(text.substring(20));

        System.out.println(text.substring(38));

        String firstHalf = text.substring(0, 8);
        
        String secondHalf = text.substring(9, 40);
        
        System.out.println(firstHalf);

        System.out.println(text.toLowerCase());

        System.out.println(text.charAt(8));

        System.out.println(text.charAt(17));

        System.out.println(text.replaceAll("o", "i"));
        
        System.out.println(text.indexOf("c"));
        

        for (int i = 0; i < text.length(); i = i + 1) {
        	char letter = text.charAt(i);
        	int ascii = (int) letter; 

            if (ascii == 102) {
                counter = counter + 1;
            }
        }
        System.out.println(text + " has " + counter + " F's"); 
	}

}
