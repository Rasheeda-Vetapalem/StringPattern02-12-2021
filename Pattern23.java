package com.ojas;

public class Pattern23 {

	public static void main(String[] args) {
		String res="";
		for(int row = 1;row <= 4;row++) {
			
			for(int col = 1;col <= 4;col++) {
				
				if(row==1||row==4||col==4||col==1) {
					res += "1"; 
				}
				else {
					res+=" ";
				}
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
