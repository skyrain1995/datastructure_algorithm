package linear.queue;

/**
 * 基于数组实现的队列（循环队列方式改进）
 * 队列空时：head == tail
 * 队列满时：(tail+1)%size = head
 */
public class CircleQueue {
    //数组：items 数组大小：size
    private String[] items;
    private int size = 0;
    //head：队头下标   tail：队尾下标
    private int head = 0;
    private int tail = 0;

    //申请大小为n的数组空间
    public CircleQueue(int n){
        items = new String[n];
        size = n;
    }

    //入队
    public boolean enqueue(String item){
        if((tail+1) % size == head) {     //如果(tail+1) % size == head表示队列已满
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % size;
        return true;
    }

    //出队
    public String dequeue(){
        if(head == tail){     ////如果head == tail表示队列为空
            return null;
        }
        String ret = items[head];
        head = (head + 1) % size;
        return ret;
    }
}
