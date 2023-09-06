package com.class10;

public class QuickSort {
public static void main(String[] args) {
		
		int[] intArr = {3,60,35,2,-45,320,5};
		int lengthOfArray = intArr.length;
		
		System.out.println("Before Quick Sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
		}
		
		quickSort(intArr, 0, lengthOfArray - 1);
		System.out.println();
		
		System.out.println("After Quick Sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
		}
	}
	//Here we first choose a pivot, after partitioning, we rearrange the array into sub array so each element
    //in the left sub array is less then or equal to pivot and each element in the right sub array is greater then
    //or equal to pivot

	static void quickSort(int[] intArr, int startElement , int endElement) {
		if(startElement < endElement) {
			int p = partition(intArr, startElement, endElement); //p is the partitioning index
			quickSort(intArr, startElement, p-1);
			quickSort(intArr, p+1, endElement);
		}
	}
	
	// consider last element as pivot, place the pivot at its exect location , place smaller element to left of pivot
	// and greater element to right of pivot
	static int partition(int[] intArr, int startPosition, int endPosition) {
		int pivotElement = intArr[endPosition];   //pivot element
		int i = (startPosition - 1);
		
		for(int j=startPosition; j<= endPosition ; j++) {
			// if current element is smaller then pivot
			if(intArr[j] < pivotElement) {
				i++; //increment index of smaller element
				int t = intArr[i];
				intArr[i] = intArr[j];
				intArr[j] = t;
			}
		}
		int t = intArr[i+1];
		intArr[i+1] = intArr[endPosition];
		intArr[endPosition] = t;
		return (i+1);
	}
}
