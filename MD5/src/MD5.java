import java.math.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
* Hacker Rank Challenge Java Prep
* Java MD5
* 
*
* @author  lrasata
* @version 1.0
* @since   2022-01-04
*/

public class MD5 {
    public static String getMd5(String input) {
        try {
  
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 

        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
   