package Question05;

public class LinkedCharQueue {
    private CharNode front;
    private CharNode rear;
    
    public LinkedCharQueue() {
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(char data) {
        CharNode newNode = new CharNode(data);
        
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        
        rear = newNode;
    }
    
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\0';
        }
        
        char data = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        return data;
    }
    
    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\0';
        }
        
        return front.data;
    }
    
    public void remove(char c) {
        if (isEmpty()) {
            return;
        }
        
        // If front node has the character
        if (front.data == c) {
            front = front.next;
            
            if (front == null) {
                rear = null;
            }
            
            return;
        }
        
        // Find the character in the queue
        CharNode current = front;
        CharNode prev = null;
        
        while (current != null && current.data != c) {
            prev = current;
            current = current.next;
        }
        
        // If character found
        if (current != null) {
            prev.next = current.next;
            
            // If it was the last node
            if (current == rear) {
                rear = prev;
            }
        }
    }
}