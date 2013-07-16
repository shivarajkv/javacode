package com.shivaraj.weeklyAssignment.pattern.equilateralTriangle;

public class Equi {

	public static void generateEquiTri(int i){
		String[] a= new String[(i*2)-1];
		int value=1;
		int left=(a.length/2);
		int right=(a.length/2);
		for (int j = 0; j < a.length; j++) {
			a[j]=" ";
		}
		a[(a.length/2)]=Integer.toString(value);
		while(left>=0&&right<=a.length){
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]);
			}
			left--;
			right++;
			value++;
			if(left!=-1){
			a[left]=Integer.toString(value);
			a[right]=Integer.toString(value);}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		generateEquiTri(5);
		
	}

}
