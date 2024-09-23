// Krishna Says : If you don’t fight for what you want, Don’t cry for what you lost
public class Day1 {
    
    static boolean armstrong(int n){
        int s=0;
        int temp=n;

        while(n>0){
            int x=n%10;
            s+=Math.pow(x,3);
            n=n/10;
        }
        return (s==temp);

    }

    static void fibo(int n){
        int n1=0; int n2=1; int n3;
        System.out.print(n1 + " " +n2);

        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        
    }

    static void palindrome(String s){
        boolean ispalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                ispalindrome=false;
            }
        }
        if(ispalindrome)
            System.out.println("palindrome");
        else{
            System.out.println("not palindrome");
        }
    }
    
    
    public static void main(String[] args) {
       // System.out.println(armstrong(153));
       //fibo(10);
       //palindrome("radar");
    }
}
