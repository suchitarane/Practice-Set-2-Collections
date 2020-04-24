package com.collections;

public class ImmutableString {
	public static void main(String[] args) {

		char[] array = { 's', 'u', 'c', 'h', 'i', 't', 'a' };

		MyString myString = new MyString(array);

		// display
		System.out.print("Input String is" + " ");
		myString.myPrint();
				
		// length method
		System.out.println("Length is " + " " + myString.getLength());

		// myCharAt method
		int index = 1;
		System.out.println("Character at index" + " " + index + " is " + myString.myCharAt(index));

		char[] array1 = { 'r', 'a', 'n', 'e' };
		MyString myString1 = new MyString(array1);
		System.out.print("Input String is" + " ");
		myString1.myPrint();
		// myConcat method
		myString = myString.myConcat(myString1);
		System.out.print("After concatenation:" + " ");
		myString.myPrint();
		System.out.println("Length is " + " " + myString.getLength());

		// IndexOf method
		char find= 'a';
		int indexpos = myString.myIndexOf(find);
		System.out.print("The first occurrence of "+ find+" found at index " + " " + indexpos);

	}

}