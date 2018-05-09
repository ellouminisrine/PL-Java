package Hiveprojet;

import org.apache.hadoop.hive.ql.exec.UDF;

public class RandUiid extends UDF {
	
	public static String evaluate (String id) {
		
			  return(Projet.RandUiid.evaluate(id));
			  
		   
		}}


