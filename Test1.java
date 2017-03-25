package com.runoob;

import org.junit.Test;

public class Test1 {

	@Test
	public void printArray() {

		int[] arr = { 10, 5, 7 };
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {

			if (i != arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.print("]");
	}

	@Test
	public void printTest() {

		for (int i = 0; i <=5; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
/**
 * 乘法口诀,x最大值
 * @param x
 */
	public static void printTest1(int x) {
		
		for (int i = 1; i <=x; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();

				
		
	}
}
	public static void main(String[] args) {
		printTest1(5);

	}
	
	
}