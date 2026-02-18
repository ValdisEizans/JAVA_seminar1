package service;
import java.util.Stack;

public class Exercise_08 {

	public static void main(String[] args) {
		String inputEquation = "1 - 3 * 18 / 4 + 2";
		
		String[] masivs = inputEquation.split(" ");
		
		Stack<String> stack = new Stack<>();

		for(int i=0; i<masivs.length-1; i++) {
			if(masivs[i].equals("/")) {
				double temp = Double.parseDouble(masivs[i-1]) / Double.parseDouble(masivs[i+1]);
				stack.pop();
				stack.push(String.valueOf(temp));
				continue;
				}
			/*else if(masivs[i].equals("*")) {
				double temp = Double.parseDouble(masivs[i-1]) * Double.parseDouble(masivs[i+1]);
				stack.push(String.valueOf(temp));
				continue;
				}
			else if(masivs[i].equals("-")) {
				double temp = Double.parseDouble(masivs[i-1]) - Double.parseDouble(masivs[i+1]);
				stack.push(String.valueOf(temp));
				continue;
				}
			else if(masivs[i].equals("+")) {
				double temp = Double.parseDouble(masivs[i-1]) + Double.parseDouble(masivs[i+1]);
				stack.push(String.valueOf(temp));
				continue;
				}*/
			else {
				stack.push(masivs[i]);
			}
		}
		
		
		for(String el:stack) {
			System.out.print(el);
		}
	
	}

}
