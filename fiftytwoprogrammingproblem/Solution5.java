package javacode.fiftytwoprogrammingproblem;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, T, N, j, k;
		Scanner in = new Scanner(System.in);
		
		T = in.nextInt();
		for(i = 0; i<T; i++) {
			N = in.nextInt();
			for(j = 0; j<N; j++) {
				for(k = 0; k<N; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
