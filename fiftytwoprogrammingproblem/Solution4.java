package javacode.fiftytwoprogrammingproblem;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, T, N, j;
		
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		
		for(i = 1; i<=T; i++) {
			N = in.nextInt();
			System.out.print("Case "+i+": ");
			for(j = 1; j<=N; j++) {
				if(N%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
