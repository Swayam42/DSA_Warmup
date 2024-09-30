/*30/9/2024*/
public class Day8 {
    
    static boolean palin(String s){
            int start=0;
            int end=s.length()-1;

            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
    }

    static String larPalindrome(String s){
        String largestPalin = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subStr = s.substring(i, j);
                
                if (palin(subStr) && subStr.length() > largestPalin.length()) {
                    largestPalin = subStr;
                }
            }
        }
        return largestPalin;
    }
    
    static int missing(int arr[]){
        int a=1;
        int m=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=a){
               m=a;
            }a++;
        }
        return m;
    }
    
    public static void main(String[] args) {
       // System.out.println(larPalindrome("abab"));
       int arr[]={1,2,3,5,6,7};
       System.out.println(missing(arr));
    }
}
