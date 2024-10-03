/*03/10/2024*/
import java.util.Arrays;
public class Day11 {

    static int sum(int n){
        int s=0;
        
        while(n>0){
            int x=n%10;
            s+=x;
            n=n/10;
        }

        return s;
    
       }

       static int sumDigit(int n){
        while(n>=10){
            n=sum(n);

        }
        return n;
       }

       static int countDig(int n ,char s){
        String str=Integer.toString(n);
   
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==s){
                c++;
            }
        }
        return c;

    }

    static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    static void divisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    static int avg(int arr[]){
        int n=arr.length;
        int s=0;
        for(int i=0;i<n;i++){
                s+=arr[i];
        }
        return s/n;
    }

    static void strLen(String s){
        int letter=0;
        int len=0;
        

        for(char c:s.toCharArray()){
            if(c!=' '){
                letter++;
            }
        
            len++;
        }
        System.out.println("Length : "+len);
        System.out.println("Letters : "+letter);
        System.out.println("White Spaces : "+(len-letter));
    }




    public static void main(String[] args) {
       // System.out.println(sumDigit(9875));
      // System.out.println(countDig(1322333, '3'));
      /*  for(int i=0;i<=10;i++){
        System.out.print(fibonacci(i)+" ");
       }*/
     // divisors(12);
     int a[]={1,2,3,4,5};
     //System.out.println(avg(a));
     strLen("Hello World");

    }
}
