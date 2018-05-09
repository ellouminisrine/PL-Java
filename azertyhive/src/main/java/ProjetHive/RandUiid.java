package ProjetHive;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import org.apache.hadoop.hive.ql.exec.UDF;

public class RandUiid  extends UDF {
	
	public static String evaluate (String id) {
		
		  return(Projet.RandUiid.evaluate(id));
		  
	   
	}}

          