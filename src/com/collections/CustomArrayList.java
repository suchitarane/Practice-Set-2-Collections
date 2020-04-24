package com.collections;

import java.util.ArrayList;

class CustomArrayList {
	// custom class which has data type
	// class has defined the type of data ArrayList
	// size of input 4
	int n = 4;

	public static void main(String args[]) {

		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "suchita", "rahul", "pawan", "Rupesh" };
		int marks[] = { 100, 99, 93, 94 };
	

		CustomArrayList custom = new CustomArrayList();//An instance of InnerClass can exist only within an instance of OuterClass.

		custom.addValues(roll, name, marks);
	}

	public void addValues(int roll[], String name[], int marks[]) {

		ArrayList<Data> list = new ArrayList<>(); // <E> -> E is inner class

		for (int i = 0; i < n; i++) {
			// create an object and send values to the
			// constructor to be saved in the Data class
			list.add(new Data(roll[i], name[i], marks[i])); // insert operation, listobj->custom class Dataobj
		}

		printValues(list);
	}

	public void printValues(ArrayList<Data> list) {

		for (int i = 0; i < n; i++) {

			Data data = list.get(i);

			System.out.println(data.roll + " " + data.name + " " + data.marks );
		}
	}

	class Data // inner class
	{
		// global variables of the class
		int roll;
		String name;
		int marks;
	

		Data(int roll, String name, int marks) {
			// initialize the input variable from main
			// function to the global variable of the class
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			
		}
	}

}
