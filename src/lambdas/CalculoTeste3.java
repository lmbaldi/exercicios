package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		//int -> Double ( nao permite)
		//double -> Double
		
		
		BinaryOperator<Double> calc1 = (x,y) -> {return  x + y; };
		System.out.println(calc1.apply(2.0,3.0));
		
		calc1 = (x,y) -> x * y;
		System.out.println(calc1.apply(8.0,5.0));
		
		
		BinaryOperator<Integer> calc2 = (x,y) -> {return  x + y; };
		System.out.println(calc2.apply(2,3));
		
		calc2 = (x,y) -> x * y;
		System.out.println(calc2.apply(8,5));
	}

}
