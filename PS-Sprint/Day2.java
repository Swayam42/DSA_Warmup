public class Day2 {
    
    static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }

    static int fact(int n){
        int p=1;

        for(int i=1;i<=n;i++){
            p*=i;
        }
        return p;

    }

    static int sum(int a){
        int sum=0;
        while(a>0){
            int x=a%10;
            sum+=x;
            a=a/10;
        }
        return sum;
    }

    static int gcd (int a ,int b){
        if(b==0){
            return a;
        }if(a==0){
            return b;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
       // pyramid(4);
       // System.out.println(fact(4));
       //System.out.println(sum(169));
       System.out.println(gcd(64, 16));
    }
}
