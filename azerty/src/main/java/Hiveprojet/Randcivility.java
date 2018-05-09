package Hiveprojet;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Randcivility extends UDF {


	
	  public static String evaluate(String input) {
	       return ( Projet.Randcivility.evaluate(input));
	       }

	}
 


