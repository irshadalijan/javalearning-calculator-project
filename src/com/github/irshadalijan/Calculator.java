package com.github.irshadalijan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

	public static void main(String[] args) {
		final String inputStr = ReadInput.read();
		
		Queue<String> ops; //operators
		Queue<String> nums; //numbers
		
		String numArr[] = inputStr.split("[-+*/]");
		String opArr[] = inputStr.split("[0-9]+");
		
		nums = new LinkedList<String>(Arrays.asList(numArr));
		ops = new LinkedList<String>(Arrays.asList(opArr));
		
		Double res = Double.parseDouble(nums.poll());
		
		while(!nums.isEmpty()) {
			
			String operands = ops.poll();
			Operate opr;
			System.out.println("Performin: "+ operands);
			
			switch(operands){
				case "+":
					opr = new Add();
					break;
				case "-":
					opr = new Subtract();
					break;
				case "/":
					opr = new Divide();
					break;
				case "*":
					opr = new Multiply();
					break;
				default:
					continue;
			}
			
			Double num = Double.parseDouble(nums.poll());
			res = opr.getCalculation(res, num);
			System.out.println("Res: "+ res);
		}
		
		System.out.println(res);
	}
}
