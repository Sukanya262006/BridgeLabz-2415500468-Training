
import java.util.Scanner;

public class SelectionSortScores {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[min]) min=j;
            int t=a[min]; a[min]=a[i]; a[i]=t;
        }
        for(int x:a) System.out.print(x+" ");
    }
}
