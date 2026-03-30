import java.util.Scanner;

public class CircularQueue {

    int[] queue;
    int front = 0;
    int rear = -1;
    int count = 0;
    int maxSize;

    CircularQueue(int size) {
        maxSize = size;
        queue = new int[size];
    }

    public void insert(int item) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        count++;
    }

    public int remove() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = queue[front];
        front = (front + 1) % maxSize;
        count--;

        return temp;
    }

    public int peekFront() {
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int size = sc.nextInt();

        CircularQueue q = new CircularQueue(size);

        for (int i = 0; i < size; i++) {

            System.out.print("Enter element to insert: ");
            int value = sc.nextInt();

            q.insert(value);
        }

        System.out.print("Enter new element to insert: ");
        q.insert(sc.nextInt());

        System.out.println("Removing: " + q.remove());

        System.out.print("Enter new element to insert: ");
        q.insert(sc.nextInt());

        System.out.print("Enter another element to insert: ");
        q.insert(sc.nextInt());
    }
}