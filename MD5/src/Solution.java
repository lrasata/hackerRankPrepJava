import java.util.Scanner;

/**
* Hacker Rank Challenge Java Prep
* Java MD5
* 
*
* @author  hacker rank
* @version 1.0
* @since   2022-01-04
*/

public class Solution {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			String s = scan.nextLine();
			System.out.println(MD5.getMd5(s));
		}
        
        
    }
}