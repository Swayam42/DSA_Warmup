public class Day_1 {
   
   /*Determining Even/Odd Numbers
      Difficulty: Easy */

      static void EvenOdd(int x) {
        if(x%2==0 && x!=0){
            System.out.println("Even");
        }else if(x==0){
            System.out.println("NA");
        }else{
            System.out.println("Odd");
        }
      }

      /*Checking for Prime Numbers
        Difficulty: Easy */

        static boolean prime(int x){
            int c=0;
            for(int i=1;i<=x;i++){
                if(x%i==0){
                    c++;
                }
            }
            if(c==2)
                return true;
            else return false;
            }
        
    public static void main(String[] args) {
    //EvenOdd(0);
    //System.out.println(prime(8));


   }
}
