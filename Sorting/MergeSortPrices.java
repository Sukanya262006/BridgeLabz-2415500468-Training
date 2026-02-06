
import java.util.Scanner;

public class MergeSortPrices {
    static void merge(int[] a,int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++) L[i]=a[l+i];
        for(int j=0;j<n2;j++) R[j]=a[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) a[k++]=L[i++];
            else a[k++]=R[j++];
        }
        while(i<n1) a[k++]=L[i++];
        while(j<n2) a[k++]=R[j++];
    }
    static void sort(int[] a,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
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
