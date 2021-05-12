package com.ojas;

public class Pattern25 {

	public static void main(String[] args) {
		String res="";
		for(int row = 5;row >= 1;row--) {
			
			for(int col = 1;col <= 4;col++) {
				
				if(row<=col) {
					res += "1 "; 
				}
				
				  else { 
					  res+= " "; 
					  }
				 
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
