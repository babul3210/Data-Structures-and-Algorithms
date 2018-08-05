package javacode.fiftytwoprogrammingproblem;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, T, N;
		
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		
		for(i = 0; i<T; i++) {
			N = in.nextInt();
			
			if(N%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}
