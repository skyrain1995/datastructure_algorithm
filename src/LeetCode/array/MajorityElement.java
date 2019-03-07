package LeetCode.array;

/**
 * 求众数
 * 给定一个大小为n的数组，找到其中的众数，定义众数是指在数组中出现次数大于n/2的下界的元素
 * 定义一个计数器count，遍历数组，如果重复+1，不重复-1，当计数器为0，换下一个候选值res
 * 原理：计数器减到0说明不是候选者数字的个数已经跟候选者的出现个数相同了
 */
public class MajorityElement {
    public static int majorityElement(int[] nums){
        int count = 0;
        int res = nums[0];
        for(int num:nums){
            if(count == 0){
                res = num;
                count++;
            }
            else {
                if(num == res)count++;
                else count--;
            }
        }
    return res;
    }
}
