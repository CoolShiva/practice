package com.examples.sorting.basic;

public class BubbleSort extends BaseSort {

	@Override
	void sort(int[] array) {
		for(int i=0;i<array.length;i++) {		
			for (int j=0;j<array.length;j++) {
				if(array[i]<array[j]) {
					swap(j,i,array);
				}
			}
		}
	}
	
	public static void main(String []args) {
		int []input = {3,5,1,0,2,8,4,2,7};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(input);
		print(input);
	}
}
