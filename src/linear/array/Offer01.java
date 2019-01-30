package linear.array;

public class Offer01 {
    public boolean find(int[][] array,int target){
        int m = array.length;       //行数
        int n = array[0].length;    //列数
        if(m == 0 || n == 0){
            return  false;
        }
        int i = 0,j = n-1;
        while(array[i][j] != target) {
            if(i < m && j >= 0) {
                if(array[i][j] < target){
                    i++;
                }
                else if(array[i][j] > target){
                    j--;
                }
            }
            else {
                return false;
            }
        }
        System.out.println("i="+i+"\t"+"j="+j);
        return true;
    }
}
