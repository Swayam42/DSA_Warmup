/*4/10/2024*/
public class Day12 {
    
    static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
    static boolean prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            
        }
        return c==2;
    }
    static int sumPrime(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && prime(i)){
                s+=i;
            }
        }
        return s;

    }

    static 

    public static void main(String[] args) {
        //pyramid(4);
       // System.out.print(sumPrime(12));

    }
}
