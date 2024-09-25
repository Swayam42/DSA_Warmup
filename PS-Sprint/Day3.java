public class Day3 {
    static void GCD_LCM(int a,int b){
        int n1=a;
        int n2=b;

        while(a%b !=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int gcd=b;
        int lcm=(n1*n2)/gcd;

        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);

    }

    
    
    public static void main(String[] args) {
        GCD_LCM(12, 15);
    }
}
