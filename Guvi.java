package lc2;

import java.util.Scanner;

public class Guvi {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Left top (1st rectangle)");
		int a1 = s.nextInt();
		int b1 = s.nextInt();
		System.out.println("Enter the Right top (1st rectangle)");
		int a2 = s.nextInt();
		int b2 = s.nextInt();
		System.out.println("Enter the Left top (2nd rectangle)");
		int a3 = s.nextInt();
		int b3 = s.nextInt();
		System.out.println("Enter the Right top (2nd rectangle)");
		int a4 = s.nextInt();
		int b4 = s.nextInt();
		if((a1>a4 && b1>b4) || (a2<a3 && b2<b3)){
			System.out.println("Does not overlap");
		}
		else{
			System.out.println("Overlap");
		}
		s.close();
		
}

}
