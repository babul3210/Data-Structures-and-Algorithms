package javacode.array;

public class MissingFirstNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingFirstNumber mn = new MissingFirstNumber();
		int[] A = {1,2,4,5,7,8};
		int n = mn.firstMissingPositive(A);
		System.out.println(n);
	}
	
	public int firstMissingPositive(int[] A) {
		int n = A.length;
		if(n==0) {
			return 1;
		}
		int k = partition(A)+1;
		int temp = 0;
		int first_missing_index = k;
		
		for(int i = 0; i<k; i++) {
			temp = Math.abs(A[i]);
			if(temp<=k) {
				A[temp-1] = (A[temp - 1]<0) ? A[temp -1] : -A[temp-1];
			}
		}
		for(int i = 0; i<k; i++) {
			if(A[i]>0) {
				first_missing_index = i;
				break;
			}
		}
		return first_missing_index+1;
	}

	private int partition(int[] A) {
		int n = A.length;
		int q = -1;
		
		for(int i=0; i<n; i++) {
			if(A[i]>0) {
				q++;
				swap(A, q, i);
			}
		}
		return q;
	}

	private void swap(int[] A, int q, int i) {
		if(q!=i) {
			A[q] = A[q] ^ A[i];
			A[i] = A[i] ^ A[q];
			A[q] = A[q] ^ A[i];
		}
		
	}
}
