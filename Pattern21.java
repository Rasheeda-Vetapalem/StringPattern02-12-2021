package com.ojas;

public class Pattern21 {

	public static void main(String[] args) {
		String res="";
		int count=16;
		for(int row = 1; row <= 4;row++) {
			for(int col = 1; col <= 4;col++) {
				res+= count-- + " ";
				 
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
