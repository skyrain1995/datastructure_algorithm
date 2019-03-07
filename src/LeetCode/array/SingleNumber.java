package LeetCode.array;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次，其余每个元素都出现两次，找到只出现一次的元素
 * 出现两次的元素按位异或为0
 */
public class SingleNumber {
    public int singleNumber(int[] nums){
        if(nums.length == 0) return -1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];      //java中按位异或运算符 ^
        }
        return res;
    }
}
