
/**
* Hacker Rank Challenge Java Prep
* Java Lambda Expressions
* 
*
* @author  lrasata
* @version 1.0
* @since   2022-01-04
*/
interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public static PerformOperation isOdd(){
		return (num) -> num%2 != 0;
	}
 
	 public static PerformOperation isPrime(){
	     return (number) -> {
	           if(number == 1) return true;
	           else
	           {
	               for (int i =  2; i < Math.sqrt(number); i++)
	                    if(number%i == 0) return false;
	                return true;
	           }
	       };
	 }
 
	 public static PerformOperation isPalindrome() {
	     return (num) -> {
	        String str = Integer.toString(num);
	        String reverse = "";
	        for(int i = str.length()-1; i >= 0; i--)
	           {
	               reverse = reverse + str.charAt(i);
	           }
	           if(reverse.equals(str)) return true;
	           return false;
	         
	     };
	 }
 
 
}


