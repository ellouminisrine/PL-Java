package Hiveprojet;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Randname extends UDF {
	
	public static String evaluate(String input) {
	    return( Projet.Randname.evaluate(input));  
	}} 