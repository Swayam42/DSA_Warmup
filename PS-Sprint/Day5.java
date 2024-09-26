import java.util.Arrays;
public class Day5 {
    
    static int sum1(int a){
        int c=0;
        int x=a;
        while(a>0){
            a=a/10;
            c++;
        }
        int s=0;
        while(x>0){
            int z=x%10;
            s+=(int)Math.pow(z,c);
            x=x/10;

        }
        return s;
    }
    static void armstrong(int a,int b){
        
        for(int i=a;i<=b;i++){
            if(i==sum1(i)){
                System.out.print(i+" ");
            }
        }
    }

    static void table(int a){

        for(int i=1;i<=10;i++){
            System.out.println(a+ " x "+i+" = "+a*i);
        }
    }
    
    static boolean p(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return (c==2);
    }
    static void prime(int a,int b){
       int arr[]=new int[b-a+1];
       int index=0;
        for(int i=a;i<=b;i++){
            if(p(i)){
                arr[index++]=i;
                
            };
        }

        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        
        }
    
    public static void main(String[] args) {
        //armstrong(1, 500 );
       // table(4);
       //prime(10, 30);
    }
}
