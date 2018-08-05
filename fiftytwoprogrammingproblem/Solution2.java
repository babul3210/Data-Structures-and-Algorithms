package javacode.fiftytwoprogrammingproblem;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, T, n;
		String N;
		
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		
		for(i=0; i<T; i++) {
			N = in.next();
			n = Integer.parseInt(N.substring(N.length()-1));
			if(n%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}
