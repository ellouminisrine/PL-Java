package Hiveprojet;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Randchild extends UDF {

	
	  public static String evaluate(String mydata) {
	       return ( Projet.Randchild.evaluate(mydata));
	       }

	}

	


