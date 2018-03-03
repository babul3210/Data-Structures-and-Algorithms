// Java code for Max
// Water Container
import java.util.*;

class Area{

	public static int maxArea(int A[], int len)
	{
		int l = 0;
		int r = len -1;
		int area = 0;

		while (l < r)
		{
			// Calculating the max area
			area = Math.max(area,
						Math.min(A[l], A[r]) * (r - l));

			if (A[l] < A[r])
				l += 1;

			else
				r -= 1;
		}
		return area;
	}

	public static void main(String[] args)
	{
		int a[] = {2,3,5,6,8};
		int b[] = {2,3,5,6,8};

		int len1 = 4;
		System.out.print( maxArea(a, len1)+"\n" );

		int len2 = 4;
		System.out.print( maxArea(b, len2) );
	}
}

// This code is contributed by rishabh_jain
