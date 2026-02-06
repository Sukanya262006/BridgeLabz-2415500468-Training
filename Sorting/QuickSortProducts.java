
import java.util.Scanner;

public class QuickSortProducts {
    static int partition(int[] a,int l,int h){
        int p=a[h], i=l-1;
        for(int j=l;j<h;j++){
            if(a[j]<p){
                i++;
                int t=a[i]; a[i]=a[j]; a[j]=t;
            }
        }
        int t=a[i+1]; a[i+1]=a[h]; a[h]=t;
        return i+1;
    }
    static void sort(int[] a,int l,int h){
        if(l<h){
            int pi=partition(a,l,h);
            sort(a,l,pi-1);
            sort(a,pi+1,h);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sort(a,0,n-1);
        for(int x:a) System.out.print(x+" ");
    }
}
