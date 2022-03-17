package com.cap;
import java.util.Scanner;
public   class Series {
	 public static   void gen() {
		 Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 int i=1;
		 while(i<=n) {
			 System.out.println(i);
			 i++;
		 }
	 }
	 public static  void CPosNeg() {
		 Scanner scan=new Scanner(System.in);
		 int num=0;
			int i=1;
			int coutpos=0;
			int coutneg=0;
			while(i<=10) {
				num=scan.nextInt();
				if(num>0) {
					coutpos++;
				}
				else {
					coutneg++;
				}
				
				i++;	
				}
			System.out.println("Count of Positive numbers = "+coutpos);
			System.out.println("Count of Negative numbers = "+coutneg);
			}
	 
public static  void CVowCon() {
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	char choice=ch;
	
	switch(ch) {
	case 'A':
	case 'a':
	case 'E':
	case 'e':
	case 'I':
	case 'i':
	case 'O':
	case 'o':
	case 'U':
	case 'u':System.out.println("Entered char is vowel");
	        break;
	default:System.out.println("Entered char is consonants");
	}
}
	

}
