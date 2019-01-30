package linear.array;

/**
 * [剑指offer] 调整数组顺序使奇数位于偶数前面
 * 不使用额外空间
 * 类似冒泡算法，若连续的[j]和[j+1]分别是偶数和奇数的话，就交换两者位置
 * 第一趟比较下来最末的偶数置于数组最后的位置
 * 第二趟比较下来倒数第二个偶数置于次末位
 */

public class Offer02 {
    public boolean isEven(int n){
        return n % 2 == 0;
    }

    public void reOrderArray(int[] array){
        int k;
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length - 1;j++){
                if(isEven(array[j]) && (!isEven(array[j+1]))){
                    k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                }
            }
        }
    }
}
