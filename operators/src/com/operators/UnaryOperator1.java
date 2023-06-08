package com.operators;

public class UnaryOperator1 {
public static void main(String[] args) {
	//int a=5, b=9;
	//a= a+(a++ - ++b +a);
	//System.out.println(a);
	//int x =3, y=7;
	//x-= x++ - ++y;
	//System.out.println(x);
	//int x=5;
	//x= 5* ++x;
	//System.out.println(x);
	//x=5* x++;
	//System.out.println(x);
	int a=2,b=3,c=3;
	//a= a-(b++)*(--c);
	//System.out.println(a);
	a= a*(++b)% c;
	System.out.println(a);
}
}
