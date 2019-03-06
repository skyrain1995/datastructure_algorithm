package graph.dfs;

import java.util.List;

/**
 * 递归实现深度优先（DFS）算法
 * 用邻接矩阵表示图
 */
public class DFSByRecursion {
    /*
    matrix为邻接矩阵，nodeIndex为开始遍历的结点的下标，list为所有结点的列表
     */
    public void dfsByRecursion(int[][] matrix,int nodeIndex,List<Node> list){
        //开始遍历结点
        Node node = list.get(nodeIndex);
        //打印
        System.out.print(node.getData()+"-->");
        //标记为已访问
        node.setVisited(true);
        //通过邻接矩阵判断当前结点是否与其他结点相连接
        for (int i = 0;i < matrix.length;i++){
            int weight = matrix[nodeIndex][i];
            if(weight != 0){        //若有边
                if(list.get(i).isVisited()){   //判断该点是否被访问过
                    continue;
                }else {         //若没被访问过，调用当前方法递归
                    dfsByRecursion(matrix,i,list);
                }
            }else {
                continue;
            }
        }
    }
}
