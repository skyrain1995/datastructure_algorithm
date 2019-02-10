package sort;

/**
 * 归并排序的实现,稳定排序，复杂度为O（nlogn）
 * 缺点：在合并两个有序数组为一个有序数组时，需要借助额外的存储空间
 */
public class MergeSort {
    //a[]表示数组,给下标p到r之间的数组排序
    public void mergeSort(double[] a,int p,int r){
        //递归终止条件
        if(p >= r){return;}
        //取p到r之间的中间位置q
        int mid = (p + r)/2;
        //分治递归
        mergeSort(a,p,mid);
        mergeSort(a,mid+1,r);
        merge(a,p,mid,r);
    }
    public void merge(double[] a,int p,int mid,int r){
        //a[p,mid]和a[mid+1,r]归并
        int n1 = mid - p + 1;                 //左数组中元素个数
        int n2 = r - mid;                     //右数组中元素个数
        double[] left = new double[n1+1];
        double[] right = new double[n2+1];
        for (int i = 0; i < n1; i++) {      //将左数组中元素存到left中
            left[i] = a[p+i];
        }
        for(int j = 0; j < n2; j++){
            right[j] = a[mid+1+j];
        }
        left[n1] = Double.POSITIVE_INFINITY;    //设置left数组最后的元素为无穷大的哨兵元素
        right[n2] = Double.POSITIVE_INFINITY;   //设置right数组最后的元素为无穷大的哨兵元素
        int i = 0;
        int j = 0;
        for(int k = p;k <= r;k++){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;
            }
            else{
                a[k] = right[j];
                j++;
            }
        }
    }
}
