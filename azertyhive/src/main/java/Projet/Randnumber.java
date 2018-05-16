package Projet;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Randnumber {
	

	 public static void main(String[] args)	{

		 String number = "0033 7 68 10 20 18";
		 
		 System.out.println( "number = " + evaluate( number ) );
		 number="";
		 System.out.println( "number = " + evaluate( number ) );
		 String ip = "192.168.56.167";
		 System.out.println( "number = " + evaluate( ip, 0 ) );
	 }
	 
	 	public static String evaluate( String number) {
	 		return ( evaluate( number, 5) );
	 	}
	 
	public static String evaluate(String number, int offset) {
		if (number == null || number.length() == 0)
			return number;

		Random rnd = new Random();
		Boolean bCountry_00 = false;
		if (number.startsWith("00")) {
			bCountry_00 = true;
			number = number.replaceFirst("^00", "+");
		}

		String strFormat = number.replaceAll("[0-9]", "%d");
		String strNumber = number.replaceAll("[^0-9]", "");
		byte[] b = strNumber.getBytes();
		Integer[] numbers = new Integer[b.length];
		for (int i = 0; i < b.length; i++) {
			if (i >= offset)
				numbers[i] = rnd.nextInt(10);
			else
				numbers[i] = (int) b[i] - (int) '0';
		}
		number = String.format(strFormat, numbers);
		if (bCountry_00) {
			number.replaceFirst("^+", "00");
		}

		return (number);
	}
}
	    
/*	    
	    
	    
	    
	   
	    String n = number.substring(5, number.length());
	    int length= n.length();
	    String  randomstr = RandomStringUtils.random(length,n);
	 
	    String str = (upToNCharacters+ randomstr).replaceAll("\\s+","");
	    StringBuilder tempnumber = new StringBuilder(str.toString());
	    char[] charnumber = tempnumber.toString().toCharArray();
	    
	    for (int i = 0; i < number.length(); i++) {
	         
	    	char num = number.charAt(i);
             	if (num == ' ') {
             	  sb.append 	
             	}    
             	}
	    ///////////  ajouter des espaces 
/*	    StringBuilder temp = new StringBuilder(str.toString());
	    StringBuilder tempnumber = new StringBuilder(number.toString());
	    StringBuilder sb = new StringBuilder(18);
	    char[] chars = temp.toString().toCharArray();
	    char[] charnumber = tempnumber.toString().toCharArray();
	    
	    for (int i = 0; i < charnumber.length; i++) {
	    	 for (int j = 0; j < chars.length; j++) {
	              if (i==3 )
	                 sb.append(" ");
	              else if (i == 6)
	                  sb.append(" ");
	              sb.append(chars[i]);
	    }
	    
	    
	    
	    
	    
	    
	    
	    //String padded = String.format("%-20s", str);   
	    int i =0;
		while((i=(number.indexOf(" ",i)))>0) {
		
			for(int j = 0; j >= str.length(); j++) {
				if 
				//return String.format("%1$-" + i + "s", str).concat(' ');
				str.substring(j,i).concat(" ");
				
				j=j+i;
				
				
			} i++;
}*/


		








	 
	 
	 
	 
	 
	






