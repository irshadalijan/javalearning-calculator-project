package com.github.irshadalijan;

import java.util.Scanner;

public class ReadInput {
	
	public static String read() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type any calculating Expression: e.g: 4*3/2");
		
		String inputStr = scan.nextLine();
		
		scan.close();
		return inputStr;
	}

}
