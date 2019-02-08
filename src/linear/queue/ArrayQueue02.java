package linear.queue;

/**
 * 基于数组实现的队列（数据搬移方式改进）
 * 改进ArrayQueue01的入队操作
 */
public class ArrayQueue02 {
    //数组：items 数组大小：size
    private String[] items;
    private int size = 0;
    //head：队头下标   tail：队尾下标
    private int head = 0;
    private int tail = 0;

    //申请大小为n的数组空间
    public ArrayQueue02(int n){
        items = new String[n];
    }

    //入队
    public boolean enqueue(String item){
        if(tail == size){     //如果tail==n表示队列已满
           if(head == 0) {
            return false;
           }
           //如果head不为0，则进行数据搬移
            for(int i = head;i < tail;i++){
                items[head - i] = items[i];
            }
            //搬移结束后重新更新head和tail
            tail -= head;
            head = 0;
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
