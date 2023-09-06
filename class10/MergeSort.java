package com.class10;
//devide and conquer File
//we create sub list until list can not be devided furthur
public class MergeSort {
public static void main(String[] args) {
		
		int[] intArr = {3,60,35,2,-45,320,5};
		int lengthOfArray = intArr.length;
		
		System.out.println("Before Merge Sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
		}
		
		mergeSort(intArr, 0, lengthOfArray - 1);
		System.out.println();
		
		System.out.println("After Merge Sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
		}
	}

static void mergeSort(int intArr[], int beginningPosition, int endingPosition) {
	if(beginningPosition < endingPosition) {
		int midPosition = ( beginningPosition + endingPosition) /2;
		mergeSort(intArr,beginningPosition, midPosition);
		mergeSort(intArr, midPosition+1, endingPosition);
		merge(intArr, beginningPosition, midPosition, endingPosition);
	}
}

static void merge(int intArr[], int beginningPosition, int midPosition, int endingPosition) {
	int i,j,k;
	
	int firstNumber = midPosition - beginningPosition + 1;
	int secondNumber = endingPosition  - midPosition;
	
	//temporary Array for sorting
	int leftArray[] = new int[firstNumber];
	int rightArray[] = new int[secondNumber];
	
	//temporary Arrays for sorting
	for(i=0;i<firstNumber;i++) {
		leftArray[i] = intArr[beginningPosition + i];
	}
	
	for(j=0;j<secondNumber;j++) {
		rightArray[j] = intArr[midPosition + 1 + j];
	}
	
	
	i=0; //initial index of first sub array
	j=0;//initial index of second sub array
	k=beginningPosition;//initial index of merged sub array
	
	while(i<firstNumber && j< secondNumber) {
		if(leftArray[i] <= rightArray[j]) {
			intArr[k] = leftArray[i];
			i++;
		}
		else {
			intArr[k] = rightArray[j];
			j++;
		}
		k++;
	}
	
	while(i<firstNumber) {
		intArr[k] = leftArray[i];
		i++;k++;
	}
	
	while(i<secondNumber) {
		intArr[k] = rightArray[j];
		i++;k++;
	}
}
}
