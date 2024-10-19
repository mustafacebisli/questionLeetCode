package Question33Sum;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	
	//2 li pointer kullanımı için güzel bir örnek 
	//Algoritma. -> Bir target belirleniyor öncelikle. ardından kalan diğer iki sayı twoSum methodu ile bulunuyor. Bulunma esnasında j'nin yer değiştirmesi kodun çok uzun bir requestte bile hızlı çalışmasına olanak sağlıyor.
	//tabi bu işlemleri daha hızlı yapmak ve aramayı kolaylaştırmak amaçlı önce diziyi sıralıyor.
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int l=0;
        for(int i=0; i<len-2 && nums[i]<=0; i++) {
            if(i!=0 && nums[i-1]==nums[i]) continue;
            twoSum(-nums[i], i+1, nums, res);
        }
            
        return res;
    }

    private void twoSum(int target, int j, int[] numsArr , List<List<Integer>> result) {
        int k = numsArr.length-1;
        while(j < k) {
            if(numsArr[j] + numsArr[k] > target) {
                k--;
                continue;
            } 
            if (numsArr[j] + numsArr[k] < target) {
                j++;
                continue;
            } 
            
            result.add(Arrays.asList(-target, numsArr[j], numsArr[k]));
            j++;
            k--;

            while(j<k && numsArr[j]==numsArr[j-1]) j++; //j nin aynı sayı olma durumunu kontrol ediyor.
        }
    }

}
