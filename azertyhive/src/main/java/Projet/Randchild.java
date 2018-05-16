package Projet;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;

public class Randchild {
	 public static void main(String[] args)	{

		 String number = "";
		 
		 System.out.println( "number = " + evaluate( number ) );
		 number="Yes";
		 System.out.println( "number = " + evaluate( number ) );
	 }

	
	 public static String evaluate(String mydata) {
		 if ( mydata == null || mydata.length() == 0)
				  return mydata;

		 int r = (int) (Math.random()*2);
	        String name = new String [] {"yes","no"}[r];
	        return(name);
	 }
	}




