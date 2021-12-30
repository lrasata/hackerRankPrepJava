import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* Hacker Rank Challenge Java Prep
* Tag Content Extractor
* In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. 
* Note that the corresponding end tag starts with a /.
* Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within 
* sequences of well-organized tags. 
*
* @author  lrasata
* @version 1.0
* @since   2021-12-30
*/

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
            int count = 0;
			Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                if (matcher.group(2).length() !=0) {
                    System.out.println(matcher.group(2));
                    count++;
                }
            }
            if (count == 0) System.out.println("None");
            
			testCases--;
		}
	}
}
