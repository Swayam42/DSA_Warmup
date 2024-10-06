/*06/10/2024*/
public class Day14 {
    public static void lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256]; 
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; 
        }

        int maxLength = 0;
        int left = 0;
        int start = 0; 

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            
            if (lastIndex[currentChar] >= left) {
               
                left = lastIndex[currentChar] + 1;
            }

            
            lastIndex[currentChar] = right;

           
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left; 
            }
        }

        
        System.out.println("The longest substring without repeating characters is: " + s.substring(start, start + maxLength));
        System.out.println("The length of the longest substring is: " + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        lengthOfLongestSubstring(input);
    }
}
