
class Day27 {
    
    static void randomArr(int r,int c){
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=1+(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        randomArr(3,4);
    }
}
