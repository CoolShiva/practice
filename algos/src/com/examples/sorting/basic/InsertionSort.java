package com.examples.sorting.basic;

public class InsertionSort extends BaseSort {

	@Override
	void sort(int[] array) {
		
		for( int i=1;i<array.length;i++) {
			
			int key = array[i];
			int j=i-1;
			
			while(j>=0 && array[j]> key) {
				array[j+1] =array[j];
				j=j-1;
			}
			
			array[j+1]=key;
		}
		
	}
	
	
	public static void main(String []args) {
		int []input = {3,5,1,0,2,8,4,2,7};
		InsertionSort sorter = new InsertionSort();
		sorter.sort(input);
		print(input);
	}

}
