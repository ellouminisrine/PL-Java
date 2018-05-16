package Projet;

import java.security.*;

import java.util.UUID;
import java.nio.ByteBuffer; 
 
import java.nio.LongBuffer;


public class RandUiid {

						
		public static String evaluate (String id) {
		  if ( id == null || id.length() == 0)
					  return id;
		  try {
			  
		   byte[] bytesOfMessage = id.getBytes("UTF-16LE");

	        MessageDigest md = MessageDigest.getInstance("MD5");
	        		
	        byte[] md5 = md.digest(bytesOfMessage);
	           
	        ByteBuffer bb = ByteBuffer.wrap(md5);
	        LongBuffer ig = bb.asLongBuffer();
	      
	        return ( new UUID(ig.get(0), ig.get(1)).toString().toUpperCase());
	        
		  } catch (Exception e) {
			  return("");
		   
		}}}