package ProjetHive;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;


public class Randcivility  extends UDF {


	
	  public static String evaluate(String input) {
	       return ( Projet.Randcivility.evaluate(input));
	       }

	}



