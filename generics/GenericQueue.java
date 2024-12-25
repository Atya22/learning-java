import java.util.LinkedList;
import java.util.List;

public class GenericQueue<T> {
    List<T> queue;

    public GenericQueue() {
        this.queue = new LinkedList<>();
    }


    public void enqueue(T element) {
        queue.addLast(element);
    }

    public void dequeue() {
        queue.removeFirst();
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
