package Question33Sum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// -8, -6, -2, 0, 2, 4, 4, 6,
	// 	2, 4, 4, 6,
	// -8, -6, -2,
	//  0,
	
	
	public static List<List<In0teger>> threeSum(int[] nums) {
        
		HashSet<Integer> numsPozitif = new HashSet<Integer>();
		HashSet<Integer> numsNegatif = new HashSet<Integer>();
		boolean isThereAZero = false;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				numsPozitif.add(nums[i]);
			}
			else if(nums[i] < 0) {
				numsPozitif.add(nums[i]);
			}
			else
				isThereAZero = true;
		}
		
		for (Iterator iterator = numsPozitif.iterator(); iterator.hasNext();) {
			
		}
		
		
		
		return int[] {1,2};
    }

}
