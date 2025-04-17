package Question05;

public class Test {
    public static void main(String[] args) {
        // Example 1
        NonRepeatingCharFinder finder1 = new NonRepeatingCharFinder("swiss");
        char result1 = finder1.findFirstNonRepeating();
        System.out.println("Input: \"" + finder1.inputString + "\"");
        System.out.println("Output: '" + result1 + "' (since 's' repeats, '" + result1 + "' is the first non-repeating character)");
        System.out.println();
        
        // Example 2
        NonRepeatingCharFinder finder2 = new NonRepeatingCharFinder("algorithm");
        char result2 = finder2.findFirstNonRepeating();
        System.out.println("Input: \"" + finder2.inputString + "\"");
        System.out.println("Output: '" + result2 + "' (since it is the first non-repeating character)");
        System.out.println();
        
        // Example 3
        NonRepeatingCharFinder finder3 = new NonRepeatingCharFinder("aabb");
        char result3 = finder3.findFirstNonRepeating();
        System.out.println("Input: \"" + finder3.inputString + "\"");
        if (result3 == '\0') {
            System.out.println("Output: No non-repeating character found");
        } else {
            System.out.println("Output: '" + result3 + "' (since it is the first non-repeating character)");
        }
    }
}