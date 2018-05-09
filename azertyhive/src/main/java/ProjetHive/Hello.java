package ProjetHive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Hello extends UDF {
	public static String evaluate() {
	       return ( evaluate ( "Bonjour"));
	       }
	public static String evaluate(String strName) {
	       return ( strName);
	       }

}
