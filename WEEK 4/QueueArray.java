public class QueueArray {

    int maxSize = 5;
    int[] queue = new int[maxSize];

    int front = 0;
    int rear = -1;
    int count = 0;

    // insert
    public void insert(int item) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        queue[rear] = item;
        count++;
    }

    // remove
    public int remove() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = queue[front];
        front++;
        count--;

        return temp;
    }

    // peek front
    public int peekFront() {
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public int getCount() {
        return count;
    }

    public void displayQueue() {

        System.out.print("Queue elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}

