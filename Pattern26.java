package com.ojas;

public class Pattern26 {

	public static void main(String[] args) {
		String res="";
		int count=10;
		for(int row = 4;row >= 1;row--) {
			
			for(int col = 1;col <=row ;col++) {
				res += count+" ";
				count--;
			
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
