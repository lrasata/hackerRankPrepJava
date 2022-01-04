import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
* Hacker Rank Challenge Java Prep
* Java Lambda Expression
* 
*
* @author  hacker rank
* @version 1.0
* @since   2022-01-04
*/

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
			    op = MyMath.isOdd();
			    ret = MyMath.checker(op, num);
			    ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
			    op = MyMath.isPrime();
			    ret = MyMath.checker(op, num);
			    ans = (ret) ? "PRIME" : "COMPOSITE";
		   } else if (ch == 3) {
		    op = MyMath.isPalindrome();
		    ret = MyMath.checker(op, num);
		    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
		
		   }
		   System.out.println(ans);
		}
	}
}
