package streams;

import java.util.function.UnaryOperator;

public class Util {
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//	public final static UnaryOperator<String> addExclamacao = n -> n + "!!! ";
	
	public final static String addExclamacao(String n) {
		 return n + "!!! ";
	} 

}
