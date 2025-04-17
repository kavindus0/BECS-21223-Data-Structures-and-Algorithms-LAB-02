package Question05;

public class NonRepeatingCharFinder {
    String inputString;
    
    public NonRepeatingCharFinder(String inputString) {
        this.inputString = inputString;
    }
    
    public char findFirstNonRepeating() {
        LinkedCharQueue queue = new LinkedCharQueue();
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Process each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            
            // Increase count of current character
            charCount[c]++;
            
            // If it's the first occurrence, add to queue
            if (charCount[c] == 1) {
                queue.enqueue(c);
            } 
            // If character repeats, remove it from queue
            else if (charCount[c] == 2) {
                queue.remove(c);
            }
        }
        
        // The front of queue has first non-repeating character
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        
        // If no non-repeating character exists
        return '\0';
    }
}