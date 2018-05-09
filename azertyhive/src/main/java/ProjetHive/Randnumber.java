package ProjetHive;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class Randnumber  extends UDF {
	
	public static String evaluate( String number) {
 		return ( evaluate( number, 5) );
 	}
 
 	public static String evaluate( String number, int offset ) {
 		   Random rnd = new Random ();
    Boolean bCountry_00 = false;
    if ( number.startsWith("00"))
    {
    	bCountry_00 = true;
    	number = number.replaceFirst("^00", "+");
    }

    
    String strFormat = number.replaceAll("[0-9]", "%d");
    String strNumber = number.replaceAll("[^0-9]", "");
    byte [] b = strNumber.getBytes();
    Integer [] numbers = new Integer[b.length];
    for ( int i = 0; i < b.length; i++)
    {
    	if ( i >= offset )
    	   numbers[i] = rnd.nextInt(10);
    	else
    	   numbers[i] = ( int ) b[i] - ( int ) '0';
    }
    number = String.format(strFormat,  numbers);
    if ( bCountry_00  )
    {
    	number.replaceFirst("^+", "00");
    }
    		
    
    return ( number );}
}
