package ProjetHive;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class Randname extends UDF {
	
	public static String evaluate(String input) {
	    return( Projet.Randname.evaluate(input));  
	}} 

