/*11/10/24*/
public class Day19 {
    
    static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static void FiboMatrix(int size){
        int n=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print(fibo(n)+" ");
                n++;
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

    static int sumPrime(int a){
        int s=0;int c=0;int num=2;
        while(c<a){
            if(prime(num)){
                s+=num;
                c++;
            }
            num++;    
        }
        return s;


    }
    
    public static void main(String[] args) {
        //FiboMatrix(3);
        System.out.println(sumPrime(4));
    }
}
