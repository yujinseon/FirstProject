package javaexp.a00_exp;

import java.util.ArrayList;

public class A09_1110 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
			System.out.println(i+"번쨰 수 "+array[i]);
		}

		int result = 0;
		int result1 = 100;
		for(int i=0; i<array.length; i++) {
			int max = array[i];
			if(max>result) {
				result=max;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			int min = array[i];
			if(min<result1) {
				result1=min;
			}
		}
		System.out.println("제일 큰 값은: " + result);
		System.out.println("제일 작은 값은: " + result1);
		
		// 강사님의 풀이
		ArrayList<Integer> ranList = new ArrayList<Integer>();
		for(int cnt = 1; cnt <= 10; cnt ++) {
			int ran = (int)(Math.random()*100+1);
			ranList.add(ran);
			System.out.println(ran+"\t");
		}
		System.out.println();
		int max = 0;
		int min = 100;
		for(int idx=0; idx<ranList.size(); idx++) {
			int data = ranList.get(idx);
			if(data > max) {
				max = data;
			}
			if(data < min) {
				min = data;
			}
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
	}
	
	

}
