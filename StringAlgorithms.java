public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        int numChar = word.length();
        int currentLetter = 0;
        String fullString = "";
        String singleLetter = "";
        
        while (currentLetter != numChar) {
           singleLetter = word.substring(currentLetter, currentLetter + 1);
           currentLetter += 1;
           fullString += singleLetter;
           fullString += "\n";
        }
        
        return "" + fullString;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        int currentLetter2 = word.length();
        String fullString2 = "";
        String singleLetter2 = "";
        
        while (currentLetter2 > 0) {
           singleLetter2 = word.substring(currentLetter2 - 1, currentLetter2);
           currentLetter2 -= 1;
           fullString2 += singleLetter2;
        }
        return fullString2;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        int currentLetter3 = 0;
        int numChar = sentence.length();
        String fullString3 = "";
        String singleLetter3 = "";
        
        while (currentLetter3 < numChar) {
           singleLetter3 = sentence.substring(currentLetter3, currentLetter3 + 1);
           if (currentLetter3 == 0) {
              singleLetter3 = singleLetter3.toUpperCase();
           }
           fullString3 += singleLetter3;
           currentLetter3 += 1;
           
        
        }
        return fullString3;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("\nTesting printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}