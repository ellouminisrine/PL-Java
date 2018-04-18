package Projet;
import java.util.Random;
//import org.postgresql.pljava
import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.hadoop.hive.ql.exec.UDF;

public class Randname  {
			
	public static void main(String[] args) {
			
			Random rand = new Random();
			int  n = rand.nextInt(20) + 5;	
			String input= "Nisrine";
			char[] possibleCaracter= (new String ("AZERTYUIOPQSDFGHJKLMWXCVBNazertyuiopqsdfghjklmwxcvbn")).concat(input).toCharArray();
		    String  randomstr = RandomStringUtils.random(n, possibleCaracter);
		    System.out.println(randomstr);  
		}} 