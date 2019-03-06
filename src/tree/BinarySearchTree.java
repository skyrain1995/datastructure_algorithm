package tree;

/**
 * 二叉查找树的实现
 */
public class BinarySearchTree {
    private TreeNode tree;
    public void setTree(TreeNode tree){
        this.tree = tree;
    }

    //查找
    public TreeNode find(int val){
        TreeNode p = tree;
        while (p != null){
            if(val < p.val){
                p = p.left;
            }else if(val > p.val){
                p = p.right;
            }else {
                return p;
            }
        }
        return null;
    }

    //插入
    public void insert(int val){
        if(tree == null){   //如果树是空树，直接插入
            tree = new TreeNode(val);
            return;
        }
        TreeNode p = tree;
        while (p != null){
            if(val > p.val){
                if(p.right == null){
                    p.right = new TreeNode(val);
                    return;
                }
                p = p.right;
            }else{    //val < p.val
                if(p.left == null){
                    p.left = new TreeNode(val);
                    return;
                }
                p = p.left;
            }
        }
    }

    //删除
    public void delete(int val){
        TreeNode p = tree;    //p为要删除的结点
        TreeNode pp = null;   //pp为p的父节点
        while(p != null && p.val != val){
            pp = p;
            if(val > p.val){p = p.right;}
            else p = p.left;
        }

        if(p == null){return;}  //没有找到

        //如果要删除的结点有两个子节点
        if(p.left != null && p.right != null){  //查找右子树中的最小节点
            TreeNode min = p.right;
            TreeNode minP = p;    //minP为min的父节点
            while(min.left != null){
                minP = min;     //
                min = min.left;
            }
            p.val = min.val;  //将min的值替换给p
            if(min.right != null){       //删除min结点，如果存在右子节点，则右子节点赋值给min
                min = min.right;
            }else {
                minP.left = null;
            }
        }
        //如果删除的是叶节点
        else if(p.left == null && p.right == null){
            p = null;
        }
        //如果删除的结点只要一个子节点
        else{
            if(p.right != null){p = p.right;}
            else p = p.left;
        }
    }
}
