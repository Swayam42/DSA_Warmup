public class Day7 {
   
   static void prime(int n){
    
    for(int i=1;i<n;i++){
        int c=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                c++;
            }
        }
        if(c==2){
            System.out.print(i+ " ");
        }
    }

   }


   static int digits(int n){
    int c=0;
    while(n>0){
        n=n/10;
        c++;
        
    }
    return c;

   }

   static boolean narcissistic(int n){
    int o=n;
    int c=digits(n);
    int s=0;
    while(n>0){
        int x=n%10;
        s+=(int)Math.pow(x,c);
        n=n/10;
    }
    return (s==o);




   }

   static void pattern (int n){
    int c=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(c+" ");
            c++;
        }System.out.println();
    }

   }

   static int sumFact(int n){
    int s=0;
    int p=1;
    for(int i=1;i<=n;i++){
        p*=i;
    }
    while(p>0){
        s+=p%10;
        p=p/10;
    }

    return s;

   }
   
    public static void main(String[] args) {
        //prime(20);
       // System.out.println(digits(12345));
       //System.out.println(narcissistic(153));
       //pattern(3);
       System.out.println(sumFact(4));


    }
}
