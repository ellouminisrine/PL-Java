package Projet;

//import java.util.Random;
//import java.util.ArrayList;

//import org.apache.commons.lang3.RandomStringUtils;

//import org.apache.commons.lang3.RandomStringUtils;


public class Randcivility {
	 public static void main(String[] args)	{

		 String number = "Monsieur";
		 
		 System.out.println( "number = " + evaluate( number ) );
		 number="";
		 System.out.println( "number = " + evaluate( number ) );
	 }
	 
     public static String evaluate(String input) {
		if ( input == null || input.length() == 0)
			return input;

        int r = (int) (Math.random()*2);
        String name = new String [] {"Mr","Mrs"}[r];
        return(name);
    }


	 }

     



