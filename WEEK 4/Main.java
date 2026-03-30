public static void main(String[] args) {

    QueueArray q = new QueueArray();

    q.insert(10);
    q.insert(20);
    q.insert(30);

    q.displayQueue();

    System.out.println("Removed: " + q.remove());

    q.displayQueue();

    System.out.println("Front Element: " + q.peekFront());

    System.out.println("Queue Count: " + q.getCount());
}

