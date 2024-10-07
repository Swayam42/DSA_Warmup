/*7/10/24*/
public class Day15 {
    static int summ(int n){
        while(n>=10){
            n=sum(n);
        }
        return n;
    }

    static int sum(int n){
        int s=0;
        while(n>0){
            int x=n%10;
            s+=x;
            n=n/10;
        }
        return s;
}

static void table(int a,int b){
    for(int i=a;i<=b;i++){
        for(int j=1;j<=10;j++){
            System.out.println(i+"x"+j+"="+i*j);
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        //System.out.println(summ(129));
        table(3, 4);
    }
}
