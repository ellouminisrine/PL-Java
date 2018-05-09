package Hiveprojet;

import org.apache.hadoop.hive.ql.exec.UDF;

public class RandEmail extends UDF {

	
	  public static String evaluate(String mydata) {
	       return ( Projet.RandEmail.evaluate(mydata));
	       }

	}

