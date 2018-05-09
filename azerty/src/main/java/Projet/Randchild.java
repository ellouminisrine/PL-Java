package Projet;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;

public class Randchild {
	
	
	 public static String evaluate(String mydata) {
		 int r = (int) (Math.random()*2);
	        String name = new String [] {"yes","no"}[r];
	        return(name);
	 }
	}




