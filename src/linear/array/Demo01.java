package linear.array;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //获取数组长度
        int len = arr.length;
        System.out.println(len);
        //遍历数组中元素
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        //多个同时赋值
        int[] arr2 = new int[]{1,2,3};
        for (int i = 0;i < arr2.length;i++)
        {
            System.out.println("arr2[" + i +"]:" + arr2[i]);
            System.out.println(arr2.length);
        }
    }
}
