package com.examples.sorting.basic;

public abstract class BaseSort {

	abstract void sort(int [] array);

	public static void  print(int [] array) {
		
		if(array!=null) {
			StringBuilder sb = new StringBuilder("[");
			for(int i:array) {
				sb.append(i);
				sb.append(" ");
			}
			sb.append("]");
			
			System.out.println(sb.toString());
		}
		
	}
	
	public void swap(int i, int j, int []array) {
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
