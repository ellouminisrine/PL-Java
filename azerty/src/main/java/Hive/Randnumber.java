package Hive;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class Randnumber  extends UDF {
	
	public static String evaluate( String number) {	

		 return( Projet.Randnumber.evaluate(number));
	}

}
