/*8/10/2024*/
public class Day16 {
   
   static void diamond(int n){
    int mid = n / 2; // Middle index of the pattern
    
    // Upper part of the pattern
    for (int i = 0; i <= mid; i++) {
        // Printing spaces
        for (int j = 0; j < mid - i; j++) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 0; j < (2 * i + 1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    // Lower part of the pattern
    for (int i = mid - 1; i >= 0; i--) {
        // Printing spaces
        for (int j = 0; j < mid - i; j++) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 0; j < (2 * i + 1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
        diamond(5);
    }
}
