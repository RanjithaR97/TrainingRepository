package com.cap;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		getMenu();
		

	}

	private static void getMenu() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("==========Working=======");
		System.out.println(" 1.Number series");
		System.out.println("2.CPos and Coneg");
		System.out.println("3.Vowel or consonants");
		System.out.println("==========closing=======");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch(choice) 
		{
		case 1:Series.CVowCon();
			
		       break;
		case 2:Series.CPosNeg();
		       break;
		case 3:Series.gen();
		       break;
		default:System.out.println("Invalid choice srry");
		        
		}
		
	}
		
	

}
