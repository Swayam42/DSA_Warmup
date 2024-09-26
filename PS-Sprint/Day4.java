import java.util.Arrays;
public class Day4 {
    
    static void reverse(String s){
        char arr[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println(new String(arr));
    }

    static void max_min(int arr[]){
        int max=arr[0],min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

    }

    static void sort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
       // reverse("programming");
       int arr[]={-3,5,23,0,-99};
       //max_min(arr);
       sort(arr);
       System.out.println(Arrays.toString(arr));

    }
}
