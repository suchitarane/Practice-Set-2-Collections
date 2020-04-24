package com.collections;

class SearchElement 
{ 

	static int search(int arr[], int startIndex, int endIndex, int key) 
	{ 
		if (startIndex > endIndex) 
			return -1; 
		//1) Find middle point mid = (l + n)/2
		int midIndex = (startIndex+endIndex)/2; 
		
		//2) If key is present at middle point, return mid.
		if (arr[midIndex] == key) 
			return midIndex; 
		
		//3) If arr[l..mid] is sorted
		//If arr[l...mid] first subarray is sorted
		if (arr[startIndex] <= arr[midIndex]) //elements smaller than mid <- left array sorted
		{ 
			//3. a) If key to be searched lies in range from arr[l to arr[mid], recur for arr[l..mid].
			//check key in left array
			if (key >= arr[startIndex] && key <= arr[midIndex]) 
				return search(arr, startIndex, midIndex-1, key); 
	
			//3. b) Else recur for arr[mid+1..h]
			//search in right array
			return search(arr, midIndex+1, endIndex, key); 
		} 
		
	//If arr[0..mid] first subarray is not sorted, then arr[mid+1... n-1] must be sorted subarry
		if (key >= arr[midIndex] && key <= arr[endIndex]) 
			//4. a) If key to be searched lies in range from arr[mid+1] to arr[n], recur for arr[mid+1..n].
			return search(arr, midIndex+1, endIndex, key); 
		else
		//4. b) Else recur for arr[1..mid] 
		return search(arr, startIndex, midIndex-1, key); 
	} 
	
		public static void main(String args[]) 
	{ 
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
		int n = arr.length; 
		int key = 6; 
		int i = search(arr, 0, n-1, key); 
		if (i != -1) 
			System.out.println("Index: " + i); 
		else
			System.out.println("Key not found"); 
	} 
} 
