package com.github.irshadalijan;

public class Multiply implements Operate{

	@Override
	public Double getCalculation(Double... numbers) {
		Double result = 1.0;
		for(Double n : numbers) {
			result *= n;
		}
		return result;
	}

}