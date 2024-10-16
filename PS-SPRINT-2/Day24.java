/*16/10/24*/
public class Day24 {

    static void pattern(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
