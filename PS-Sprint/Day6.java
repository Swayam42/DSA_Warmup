public class Day6 {
    
    static boolean perfect(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        return (s==n);
    }

    static int sumEven(int a, int b){
        int s=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                s+=i;
            }
        }
        return s;
    }

    static int sumOdd(int a,int b){
        int s=0;
        for(int i=a;i<=b;i++){
            if(i%2!=0){
                s+=i;
            }
        }
        return s;
    }

    static int fibo(int a){

        int n1=0;
        int n2=1;
        int n3=0;
        
        for(int i=0;i<a-1;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
    }
        return n3;
    }
    
    public static void main(String[] args) {
       // System.out.println(perfect(28));
       //System.out.println(sumEven(1, 10));
       //System.out.println(sumOdd(1, 10));
       System.out.println(fibo(5));

    }
}
