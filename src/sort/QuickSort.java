package sort;

/**
 * 快速排序的实现，利用分治思想，复杂度为O（nlogn）
 * 可以原地排序
 */
public class QuickSort {
    public void quickSort(int[] a,int p,int r){
        if(p < r){
            int q = partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,r);
        }
    }

    public int partition(int[] a,int p,int r){
        //将小于a[r]的放在a[r]左边，大于a[r]的放在a[r]右边，返回值i+1即为a[r]的位置
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if(a[j] <= x){
                i++;                 //i+1,此时即为>x的值
                int temp1 = a[i];    //交换a[i]和a[j]
                a[i] = a[j];
                a[j] = temp1;
            }
        }
        int temp2 = a[i+1];        //交换a[i+1]和a[r]
        a[i+1] = a[r];
        a[r] = temp2;
        return i+1;
    }
}
