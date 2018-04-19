package Projet;
import org.apache.commons.lang3.RandomStringUtils;
public class Randnumber {
	
		  public static String evaluate( String number) {	
	    String upToNCharacters = number.substring(0, Math.min(number.length(),5));
	    String n = number.substring(5, number.length());
	    int length= n.length();
	    
		String  randomstr =RandomStringUtils.random(length,n);
		 return(upToNCharacters+ randomstr);
	}
		}



