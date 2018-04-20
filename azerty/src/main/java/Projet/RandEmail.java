package Projet;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

public class RandEmail {

		
  public static String evaluate(String mydata) {
       Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+(@.+)$"); 
       Random rand = new Random();

       int  n = rand.nextInt(20) + 7;	
       Matcher matcher = pattern.matcher(mydata);
        if(matcher.matches()) {
           
        }
        char[] possibleCaracter= (new String ("AZERTYUIOPQSDFGHJKLMWXCVBNazertyuiopqsdfghjklmwxcvbn123456789-")).toCharArray();
    	String  randomstr = RandomStringUtils.random(n, possibleCaracter);
    
       
        return (randomstr + matcher.group(1));}}
