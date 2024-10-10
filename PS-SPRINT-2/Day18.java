/*10/10/2024*/
public class Day18 {
   
   static void proper (int n){
    int c=0;
    int s=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            if(i%j==0){
                s+=j;
            }
        } if(s==i){
            c++;
            System.out.println(i+" is perfect");
        }
        s=0;
    }
    System.out.println("total perfect no.s: "+c);
   }

   static void larPrime(int n) {
    for (int i = n; i >= 1; i--) {
        int c = 0;
        if (n % i == 0) { 
           
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) { 
                System.out.println(i); 
                break; 
            }
        }
    }
}

   
    public static void main(String[] args) {
       // proper(30);
       larPrime(28);
    }
}
