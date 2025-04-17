package Question03;

public class VowelFinder {
    String inputString;
    
    public VowelFinder(String inputString) {
        this.inputString = inputString.toUpperCase();
    }
    
    public void findVowelsInOrder() {
        Queue resultQueue = new Queue(5); // Maximum 5 unique vowels
        
        // Check if each vowel is in the input string and add to queue in alphabetical order
        if (inputString.contains("A")) {
            resultQueue.Append('A');
        }
        
        if (inputString.contains("E")) {
            resultQueue.Append('E');
        }
        
        if (inputString.contains("I")) {
            resultQueue.Append('I');
        }
        
        if (inputString.contains("O")) {
            resultQueue.Append('O');
        }
        
        if (inputString.contains("U")) {
            resultQueue.Append('U');
        }
        
        // Print the result
        System.out.print("Output: ");
        while (!resultQueue.IsQueueEmpty()) {
            System.out.print(resultQueue.Serve() + " ");
        }
        System.out.println();
    }
    
    public boolean isVowel(char c) {
        c = Character.toUpperCase(c);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}