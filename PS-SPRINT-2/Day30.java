import java.util.Arrays;
class Day30 {
    
    static void comm(int arr1[],int arr2 []){
        int n1=arr1.length;
        int n2=arr2.length;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        
    }
    
    public static void main(String[] args) {
      int array1 []= {1,2,3,4,9};
      int array2[] = {3,4,5,6,9,8};
      comm(array1,array2);
    }
}
