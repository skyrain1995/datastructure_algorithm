package LeetCode.array;

/**
 * 搜索m*n维矩阵中的一个目标值target
 * 该矩阵特征：
 * 每行元素从左到右升序
 * 每列元素从上到下升序
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix,int target){
        if(matrix.length == 0) return false;
        int row = matrix.length;    //矩阵的行数
        int col = matrix[0].length;   //矩阵的列数
        int i = 0;
        int j = col - 1;
        while(i < row && j >= 0){
            if(matrix[i][j] == target){     //找到目标
                System.out.println("目标位置为:"+i+","+j);
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
