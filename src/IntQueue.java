import java.util.Arrays;

public class IntQueue {
    IntQueue (int capacity)
    {
        this.capacity = capacity;
        queue = new int [capacity];
    }

    void enqueue (int item){
        queue[queue.length - capacity] = item;
        capacity--;
    }

    int dequeue ()
    {
        capacity++;
        int original = queue[0];
        queue[0] = 0;
        for (int i = 1; i<=queue.length-capacity; i++)
        {
            replace(queue,i,i-1);
        }
        return original;
    }

    void replace(int [] replace, int i, int j)
    {
        int original = replace[i];
        replace[i] = replace[j];
        replace[j] = original;
    }

    boolean isEmpty ()
    {
        return queue.length==capacity;
    }

    boolean isFull()
    {
        return capacity == 0;
    }

    void print(){
        System.out.println(Arrays.toString(queue));
    }

    private int capacity;
    private final int [] queue;

}
