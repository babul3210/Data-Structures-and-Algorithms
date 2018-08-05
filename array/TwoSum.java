import java.util.Map;
import java.util.HashMap;

public class TwoSum{
	public static void main(String[]args){
		int[] nums = {4,5,3,2,1,6,7};
		int target = 12;

		int[] arr = toSum(nums, target);

		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
			}
		}

		private static int[] toSum(int[] nums, int target){
			int[] arr = new int[2];
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for(int i = 0; i<nums.length; i++){

				Integer value = map.get(target - nums[i]);
				if(value == null){
					map.put(nums[i], i);
					}else{
						arr[0] = value;
						arr[1] = i;
						break;
						}
				}
				return arr;
			}
	}