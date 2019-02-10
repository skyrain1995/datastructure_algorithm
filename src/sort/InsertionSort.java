package sort;

/**
 * 插入排序的实现，按从小到大排序 最坏复杂度为O(n^2)
 */
public class InsertionSort {
    //插入排序,a[]表示数组，n表示数组大小
    public void insertionSort(int[] a,int n){
        if(n <= 1){return;}

        for(int i = 1;i < n;i++){
            int value = a[i];
            int j = i - 1;
            //查找插入的位置
            for(;j >= 0;j--){
                if(a[j] > value){
                    a[j+1] = a[j]; //数据移动
                }
                else {
                    break;
                }
            }
            a[j+1] = value;   //插入数据
        }
    }
}
