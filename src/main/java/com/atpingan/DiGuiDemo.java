package com.atpingan;

public class DiGuiDemo {

	public static void main(String[] args) {
		
		int diGui = DiGui(5);
		System.out.println("  阶乘为 :" + diGui );
	}
	
	
	public static int DiGui(int num) {
		if(num == 1) {
			return 1;
		}else {
			return DiGui(num -1) * num; 
		}
	}
}
