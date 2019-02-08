package linear.stack;

/**
 * 基于数组实现的顺序栈
 */
public class ArrayStack {
    private String[] items;     //数组
    private int count;         //栈中元素的个数
    private int size;           //栈的大小

    //初始化数组，申请大小为n的数组空间
    public ArrayStack(int n){
        this.items = new String[n];
        this.size = n;
        this.count = 0;
    }

    //入栈操作
    public boolean push(String item){
        //数组空间不够了，直接返回false
        if(count == size){
            return false;
        }
        else{
            items[count] = item;
            count++;
            return true;
        }
    }

    //出栈操作
    public String pop(){
        //栈为空，则返回null
        if(count == 0){
            return null;
        }
        else{
            String tmp = items[count-1];
            count--;
            return tmp;
        }
    }
}
