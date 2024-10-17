public class Day25{
    static int evesum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += 2 * i;
        }
        return s;
    }

    public static void main(String[] args) {
    System.out.println(evesum(4));
}

}
