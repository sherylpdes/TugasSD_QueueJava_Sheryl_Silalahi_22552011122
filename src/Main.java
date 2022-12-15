public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(7);

        System.out.println("Initial Queue:");
        q.queueDisplay();

        q.queueEnqueue(73);
        q.queueEnqueue(40);
        q.queueEnqueue(109);
        q.queueEnqueue(57);
        q.queueEnqueue(65);
        q.queueEnqueue(230);
        q.queueEnqueue(176);

        System.out.println("Queue after Enqueue Operation:");
        q.queueDisplay();

        q.queueFront();

        q.queueDequeue();
        System.out.printf("\nQueue after first dequeue operations:");

        q.queueDisplay();

        q.queueFront();

        q.queueDequeue();
        System.out.printf("\nQueue after second dequeue operations:");

        q.queueDisplay();

        q.queueFront();

        System.out.println("\nQueue after insert element:");

        q.queueEnqueue(77);

        q.queueDisplay();
    }
}

