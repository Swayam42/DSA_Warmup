public class Day31 {
    public static void main(String[] args) {
        String input = "Find the longest word";
        System.out.println("Length of the longest word: " + findLongestWordLength(input));
    }

    public static int findLongestWordLength(String str) {
        String[] words = str.split(" ");
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }
}