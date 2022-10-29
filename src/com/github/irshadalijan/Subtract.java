package com.github.irshadalijan;

public class Subtract implements Operate{

	@Override
	public Double getCalculation(Double... numbers) {
		Double result = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			result -= numbers[i];
		}
		return result;
	}

}
