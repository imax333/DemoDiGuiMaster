package com.atpingan;

public class DiGuiDemo {

	public static void main(String[] args) {
		
		int diGui = DiGui(5);
		System.out.println("  阶乘为 :" + diGui );
		System.out.println("this  is test 1 ");
	}
	
	
	public static int DiGui(int num) {
		if(num == 1) {
			return 1;
		}else {
			return DiGui(num -1) * num; 
		}
	}
<<<<<<< HEAD
	public void say() {
		System.out.println("hello ");
	}
=======
	
	
>>>>>>> refs/heads/test1
}
