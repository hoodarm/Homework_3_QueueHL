public class Main {
    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue(6);

        intQueue.enqueue(5);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(1);
        intQueue.enqueue(7);

        System.out.println(intQueue.isFull());
        intQueue.print();

        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());

        intQueue.print();
        System.out.println(intQueue.isEmpty());
    }
}