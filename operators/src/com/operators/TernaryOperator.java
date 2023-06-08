package com.operators;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	int n1,n2;
	int l;
	//largest number among two numbers
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number");
	n1=sc.nextInt();
	System.out.println("Enter second number");
	n2=sc.nextInt();
	//l= (n1>n2)?n1:n2;
	//System.out.println("Largest of "+n1+ " and "+n2+" is "+l );
	
	
	//largest number among three number
	int n3;
	System.out.println("Enter third number");
	n3=sc.nextInt();
	//l= (n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3 )?n2:n3;
	//System.out.println("Largest of "+n1+" , "+n2+" and "+n3+" is "+l);
	
	
	//largest number among three number
	int n4;
	System.out.println("Enter fourth number");
	n4=sc.nextInt();
    //l=(n1>n2 && n1>n3 && n1>n4)?(n1):(n2>n1&& n2>n3 &&n2>n4)?n2:(n3>n1&& n3>n2&& n3>n4)?n3:n4;
	//System.out.println("Largest of "+n1+" , "+n2+" ,"+n3+" and "+n4+" is "+l);
	int n5;
	System.out.println("Enter fifth number");
	n5= sc.nextInt();
	l=(n1>n2 && n1>n3 && n1>n4 && n1>n5)?n1:(n2>n1 && n2>n3 && n2>n4 && n2>n5)?n2:(n3>n1 && n3>n2 && n3>n4 && n3>n5)?n3:(n4>n1 && n4>n2 && n4>n3 && n4>n5)?n4:n5;
	System.out.println("Largest of "+n1+", "+n2+", "+n3+", "+n4+" and "+n5+" is "+l);
}
}
