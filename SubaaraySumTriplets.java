
import java.util.Scanner;

class Sumtriplets {
    static int triple(int[] a,int n){
        int count=0;
        for(int j=1;j<n-1;j++){
            if(a[j-1]+a[j+1]==a[j]){
                count=count+1;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int res=triple(a,n);
        System.out.println(res);
    }
}
