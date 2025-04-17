package Question04;

public class LinkedQueue {
    private Node front;
    private Node rear;
    private int size;
    
    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        
        rear = newNode;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        int data = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        size--;
        return data;
    }
    
    public int size() {
        return size;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        
        StringBuilder sb = new StringBuilder("[");
        Node current = front;
        
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            
            if (current != null) {
                sb.append(",");
            }
        }
        
        sb.append("]");
        System.out.println(sb.toString());
    }
}