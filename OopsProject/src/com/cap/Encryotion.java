package com.cap;

public class Encryotion {
	
	public String Encod(String m) {
		String str="";
		String str1="aeiou";
		int j=0;
		for(int i=0;i<m.length();i++) {
			char ch=m.charAt(i);
			str=str+ch;
			System.out.println(str);
		
			String ch1 = null;
			if(ch1!= " ") {
				if(j!=5) {
					str+=str1.charAt(j);
					j++;
				}
				else {
					j=0;
					str+=str1.charAt(j);
					j++;
				}
			}
			else {
				continue;
			}
		}
			System.out.println("the Encoded message is" +str);
			
			return "hello";
				
			}

	

	public static void main(String[] args) {
		Encryotion e=new Encryotion();
		e.Encod("Hello");
	}
		
		

}
