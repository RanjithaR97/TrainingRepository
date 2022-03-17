package com.cap;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayClass  a1=new ArrayClass();
		a1.getEven();
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("enter No of elements");
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
		
			System.out.println(sum);
		}

	
public static void getEven() {
	int a[]= {3,2,4,6,8};
	for(int i:a) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
	
}


