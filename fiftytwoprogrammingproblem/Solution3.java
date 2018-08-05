package javacode.fiftytwoprogrammingproblem;

public class Solution3 {
	public static void main(String[] args) {
		int i, count=1;
		
		for(i = 1000; i>0; i--) {
			if(count%5!=0) {
				System.out.print(i+"\t");
			}else {
				System.out.print(i+"\t");
				System.out.println();
			}
			count++;
		}
	}
}
