/*1/10/2024*/
import java.util.Arrays;
public class Day9 {
    
    static void pascal(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }
    }
    

    static int median(int arr[]){
        Arrays.sort(arr);
        int m;
        int n=arr.length;
        if(n%2!=0){
            m=arr[n/2];
        }else{
            m=(arr[n/2]+arr[(n/2)-1])/2;
        }
        return m;
    }

    static int power(int b,int p){
        int res=1;
        for(int i=1;i<=p;i++){
            res=res*b;
        }
        return res;

    }

    
    public static void main(String[] args) {
        //pascal(4);
        int arr[]={3, 1, 2, 4, 5,7};
        //System.out.println(median(arr));
        //System.out.println(power(2, 4));
    }
}
