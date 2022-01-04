import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
* Hacker Rank Challenge Java Prep
* Java SHA256
* 
*
* @author  lrasata
* @version 1.0
* @since   2022-01-04
*/

public class Solution {

	public static void main(String[] args) throws NoSuchAlgorithmException {
	
	
	    Scanner input = new Scanner(System.in);
	    MessageDigest m = MessageDigest.getInstance("SHA-256");
	    m.reset();
	    m.update(input.nextLine().getBytes());
	    for (byte i : m.digest()) {
	        System.out.print(String.format("%02x", i));
	    }
	    System.out.println();
	}
}