package linear.queue;

/**
 * 基于数组实现的队列(有缺点)
 * 缺点：head和tail都会后移，当tail移动到最右边，即便数组仍有空闲空间，也无法再添加数据了
 */
public class ArrayQueue01 {
    //数组：items 数组大小：size
    private String[] items;
    private int size = 0;
    //head：队头下标   tail：队尾下标
    private int head = 0;
    private int tail = 0;

    //申请大小为n的数组空间
    public ArrayQueue01(int n){
        items = new String[n];
    }

    //入队
    public boolean enqueue(String item){
        if(tail == size){        //如果tail==n表示队列已满
            return false;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    //出队
    public String dequeue(){
        if(head == tail){     ////如果head == tail表示队列为空
            return null;
        }
        String ret = items[head];
        head ++;
        return ret;
    }
}
