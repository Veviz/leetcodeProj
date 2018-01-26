package easy;

import java.util.HashMap;

/**
 * @author Veviz
 * @description Leetcode上的第一题，“Two Sum”
 * @create 2018-01-26  20:22
 */
public class solution001 {
    /**
     * 给定一组整数，要求返回和为target的两个数的索引
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int [] nums, int target){
       int [] a = new int [2];
        HashMap <Integer,Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer n = num.get(nums[i]);
            if( n == null ){
              num.put(nums[i],i);
            }
            n = num.get(target-nums[i]);
            if (n != null && n < i) {
                a[0] = n;
                a[1] = i;
                return a;
            }
        }
        return a;
    }

}