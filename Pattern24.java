package com.ojas;

public class Pattern24 {

	public static void main(String[] args) {
		String res="";
		for(int row = 1;row <= 5;row++) {
			
			for(int col = 1;col <= 5;col++) {
				
				if(col==1||col==3||col==5) {
					res += "1"; 
				}
				
				  else { 
					  res+= "*"; 
					  }
				 
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
