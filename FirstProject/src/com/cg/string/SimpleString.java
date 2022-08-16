package com.cg.string;

public class SimpleString {

	public static void main(String[] args) {
		char c[]= {'J','A','V','A'};
		String s1 = new String(c);
		
		System.out.println(s1);
		
		String sentence="Welcome to the session." + "The session begins at 10;30 am." 
		                 + "we are learning string class and its methods.";
		System.out.println(sentence);
		
		String name1="Rahul ";
		String name2="Rishi ";
		String name3="Rajesh ";
		String storeName=name1.concat(name2.concat(name3));
	    System.out.println(storeName);	
		

	}

}
