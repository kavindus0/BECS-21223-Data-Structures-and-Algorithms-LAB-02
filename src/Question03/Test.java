package Question03;

public class Test {
    public static void main(String[] args) {
        // Example 1
        VowelFinder example1 = new VowelFinder("DIALOGUE");
        System.out.println("Input: " + example1.inputString);
        example1.findVowelsInOrder();
        
        // Example 2
        VowelFinder example2 = new VowelFinder("COMPUTER");
        System.out.println("Input: " + example2.inputString);
        example2.findVowelsInOrder();
        
        // Example 3
        VowelFinder example3 = new VowelFinder("PROGRAMMING");
        System.out.println("Input: " + example3.inputString);
        example3.findVowelsInOrder();
        
        // Example 4
        VowelFinder example4 = new VowelFinder("QUEUE");
        System.out.println("Input: " + example4.inputString);
        example4.findVowelsInOrder();
    }
}