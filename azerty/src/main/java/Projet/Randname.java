package Projet;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class Randname  {
			

		
		public static String evaluate(String input) {
			
			Random rand = new Random();
			int  n = rand.nextInt(20) + 5;
			char[] possibleCaracter= (new String ("AZERTYUIOPQSDFGHJKLMWXCVBNazertyuiopqsdfghjklmwxcvbn")).concat(input).toCharArray();
		    String  randomstr = RandomStringUtils.random(n, possibleCaracter);
		    return(randomstr);  
		}} 