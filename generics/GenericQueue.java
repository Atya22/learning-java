import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenericQueue<T> {
    Queue <T> queue;

    public GenericQueue() {
        this.queue = new LinkedList<>();
    }


    public void enqueue(T element) {
        queue.add(element);
    }

    public void dequeue() {
        queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        GenericQueue<String> myQueue = new GenericQueue<>();

        myQueue.enqueue("Hello");
        System.out.println(myQueue.isEmpty());
        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
    }
}
