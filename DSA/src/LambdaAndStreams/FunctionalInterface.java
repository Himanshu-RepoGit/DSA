package LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterface {

public static void main(String[] args) {
	List<String> li = new ArrayList<String>();
	li.stream().filter(new PredicateTest()).collect(Collectors.joining());
}
}
class PredicateTest implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.contains("m");
	}
	
}
class FunctionTest implements java.util.function.Function<Integer, Double>{

	@Override
	public Double apply(Integer t) {
		Double d =t / 2.0d;
		 return d;
	}
	
class SupplierTest implements Supplier<Double>{

	@Override
	public Double get() {
		return Math.random();
	}
	
}	
}