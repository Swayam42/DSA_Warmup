/*14/10/2024*/
public class Day22 {

    static void SumOfDiag(int arr[][]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            // Only sum the diagonal elements (i == j)
            s += arr[i][i];
        }
        System.out.println("Sum of diagonal elements: " + s);
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        SumOfDiag(arr);
    }
}
