/*9/10/2024*/
public class Day17 {
    
    static void matrixMul(int size){
       
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print(i*j +" ");
            }System.out.println();
        }

    }

    static int sumOdd(int n){
        int s=0;
        for(int i=1;i<=2*n;i=i+2){
                s+=i;
         }return s;
    }

    public static void main(String[] args) {
        //matrixMul(3);
        System.out.println(sumOdd(5));
    }
}
