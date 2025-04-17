package Question04;

public class Test {
    public static void main(String[] args) {
        // Example 1
        int[] elements1 = {1, 2, 3, 4, 5};
        QueueRotator rotator1 = new QueueRotator(elements1, 2);
        System.out.print("Input Queue: ");
        rotator1.displayQueue();
        System.out.print("Rotate by: 2\nOutput: ");
        rotator1.rotate();
        rotator1.displayQueue();
        System.out.println();
        
        // Example 2
        int[] elements2 = {10, 20, 30, 40, 50, 60};
        QueueRotator rotator2 = new QueueRotator(elements2, 3);
        System.out.print("Input Queue: ");
        rotator2.displayQueue();
        System.out.print("Rotate by: 3\nOutput: ");
        rotator2.rotate();
        rotator2.displayQueue();
        System.out.println();
        
        // Example 3
        int[] elements3 = {5, 10, 15, 20};
        QueueRotator rotator3 = new QueueRotator(elements3, 1);
        System.out.print("Input Queue: ");
        rotator3.displayQueue();
        System.out.print("Rotate by: 1\nOutput: ");
        rotator3.rotate();
        rotator3.displayQueue();
    }
}