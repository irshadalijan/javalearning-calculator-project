package com.github.irshadalijan;

public class Add implements Operate{

	@Override
	public Double getCalculation(Double... numbers) {
		Double sum = 0.0;
		for(Double n : numbers) {
			sum += n;
		}
		return sum;
	}
	
}
