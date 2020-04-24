package com.collections;

public final class MyString { // made class final , made all field final, only getters of fields

	private final char[] characters;
	private final int length;
	private final int default_size = 50;
	
	 public char[] getCharacters() {
		return characters;
	}

	public int getLength() {
		return length;
	}

	
	public MyString() { //need to initialize final values
	       this.length = default_size;
	       this.characters = new char[length];
	 }
	 
	public MyString(char ch[]) {
		this.length = ch.length; //calculate length using length (final variable) of arrays
		this.characters = new char[length];
		for (int i = 0; i < length; i++)
			characters[i] = ch[i];
	}

	
	public char myCharAt(int index) {
		if ((index < 0) || (index >= characters.length))
			System.out.println("Array Index Out Of Bound");
		return characters[index];
	}

	public MyString myConcat(MyString otherMyString) {
		
		// Calculate the length of the concatenation.
		int length = characters.length + otherMyString.characters.length;

		// Allocate the space for the new myString.
		char[] temp = new char[length];

		// Copy in all the current object characters.
		for (int i = 0; i < characters.length; i++)
			temp[i] = characters[i];

		// Copy after that all the characters from str.
		for (int i = 0; i < otherMyString.characters.length; i++)
			temp[characters.length + i] = otherMyString.characters[i];

		// Create the new myString and return it.
		return new MyString(temp);
		
		
	}

	public void myPrint() {
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == '\n') {
				break;
			} else {
				System.out.print(characters[i]);
			}
		}
		System.out.println("");
	}

	public int myIndexOf(char ch) {
		int fromIndex = 0;
		if (fromIndex < 0)
			fromIndex = 0;
		else if (fromIndex >= length)
			return -1;

		for (int i = fromIndex; i < length; i++)
		{
			if (characters[i] == ch)
				return i;
		}
			
		return -1;
	}

}