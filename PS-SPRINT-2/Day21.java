/*13/10/24*/
public class Day21 {
    static void Perfsqaure(int s,int e){
        for(int i=s;i<=e;i++){
            if((int)Math.sqrt(i)*(int)Math.sqrt(i)==i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Perfsqaure(1,10);
    }
}
