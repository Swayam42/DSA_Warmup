public class Day29 {
    
    static void sum(int arr[]){
        int n=arr.length;
        int sE=0;
        int sO=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sE+=arr[i];
            }
            else if(){
                sO+=arr[i];
            }
        }
   
        System.out.println(sE-sO);
    }
    
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
      sum(arr);
    }
}
