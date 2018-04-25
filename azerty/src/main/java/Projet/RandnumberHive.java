package Projet;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class RandnumberHive  extends UDF {
	
	public static String evaluate( String number) {	
	    String upToNCharacters = number.substring(0, Math.min(number.length(),5));
	    String n = number.substring(5, number.length());
	    int length= n.length();
	    
		String  randomstr =RandomStringUtils.random(length,n);
		 return(upToNCharacters+ randomstr);
	}

}
