package graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //1代表有边，0代表无边
        int[][] matrix = {
                {0,1,0,1,0,0,0,0},
                {1,0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0,0},
                {1,0,0,0,0,0,1,1},
                {0,0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0,0},
                {0,0,0,1,0,0,0,0},
                {0,0,0,1,0,0,0,0}
        };
        //存储每个结点的数据
        String[] nodeData = {"A","B","C","D","E","F","G","H"};
        List<Node> list = new ArrayList<>();
        for (String data:nodeData) {
            list.add(new Node(data));
        }
        DFSByRecursion test = new DFSByRecursion();
        test.dfsByRecursion(matrix,0,list);
    }
}
