package Question01;

public class Queue {
    int front;
    int count;
    char[]  queue;
    int maxSize;
    int  rear;

    public Queue(int maxSize) {
        this.front = 0;
        this.count = 0;
        this.queue = new char[maxSize];
        this.maxSize = maxSize;
        this.rear = -1;
    }

    boolean IsQueueEmpty(){
        if (rear<front)
            return true;
        else
            return false;
    }

    boolean IsQueueFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }

    void Append(char item) {
        if (IsQueueFull()) {
            System.out.printf("\nQueue is full\n");
        } else {
            queue[++rear] = (char) item;
            count++;
        }
    }

    char Serve() {
        if (IsQueueEmpty()) {
            System.out.printf("\nQueue is empty\n");
            return 0;
        }
        else {
            char x = queue[front++];
            count--;
            return x;
        }
    }





}
