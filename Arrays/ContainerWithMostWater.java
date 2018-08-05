public class ContainerWithMostWater{

	public static void main(String[]args){
		int[] height = {3,1,2,4,5};
		System.out.println(maxArea(height));
		}

		public static int maxArea(int[] height){

			if(height==null || height.length<2){
				return 0;
				}

			int max = 0, left, right;
			left = 0;
			right = height.length - 1;

			while(left<right){
				max = Math.max(max, (right-left)*Math.min(height[left],height[right]));
				if(height[left]<height[right]){
					left++;
					}else{
						right++;
						}
				}
				return max;
			}

}