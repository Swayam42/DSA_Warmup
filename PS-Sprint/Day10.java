/*02/10/2024*/
import java.util.Arrays;
public class Day10 {
   
   static boolean anagram(String s1,String s2){
   //remove any whitespaces and make it lowercase :
   s1=s1.replaceAll("\\s", "").toLowerCase();
   s2=s2.replaceAll("\\s", "").toLowerCase();
    
    if(s1.length()!=s2.length()){
        return false;
    }

    char charr1[]=s1.toCharArray();
    char charr2[]=s2.toCharArray();

    Arrays.sort(charr1);
    Arrays.sort(charr2);

    return Arrays.equals(charr1,charr2);


   }

   static boolean prime(int n){
    int c=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            c++;
        }

    }
    return (c==2);
   }

   static int sumPrime(int a,int b){
    int s=0;
    for(int i=a;i<=b;i++){
        if(prime(i)){
            s+=i;
        }
    }
    return s;
   }
/*The nth triangular number is  (sum of the first n natural numbers). */
   static int nthTrian(int n){
    int s=0;
    for(int i=1;i<=n;i++){
        s+=i;
    }
    return s;
   }

   static boolean perfectSq(int n){
    if(n<0){
        return false;
    }
    int sq=(int)Math.sqrt(n);
    return(sq*sq==n);

   }

   static int sumSqDigits(int n){
        int s=0;
        while(n>0){
            int x=n%10;
            s=s+(int)Math.pow(x,2);
            n=n/10;
        }
        return s;

   }

   static void sqMatrix(int size){
    int a=1;
    for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++){
            System.out.print(a+" ");
            a++;
        }System.out.println();
    }
   }

   

    public static void main(String[] args) {
        // if(anagram("silent", "listen")){
        //     System.out.println("Anagram");
        // }else{
        //     System.out.println("Not anagram");
        // }

        //System.out.println(sumPrime(1, 10));
        //System.out.println(nthTrian(4));
       // System.out.println(perfectSq(81));

       //System.out.println(sumSqDigits(123));
       sqMatrix(3);
    }
}
