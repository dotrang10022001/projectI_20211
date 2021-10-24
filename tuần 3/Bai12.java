package tuan3;
import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) {
		int m,n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang a[] la: ");m = sc.nextInt();
		System.out.print("Nhap vao so phan tu cua mang b[] la: ");n = sc.nextInt();
		int a[] = new int[m],b[] = new int[n];
		System.out.print("Nhap cac phan tu cua mang a[]: ");for(i=0;i<m;i++) a[i]=sc.nextInt();
		System.out.print("Nhap cac phan tu cua mang b[]: ");for(i=0;i<n;i++) b[i]=sc.nextInt();
		sc.close();
		if(m<=n) {
			i=0;j=0;
			sort(a);sort(b);
			while(i<m&&j<n) 		
			if(a[i]==b[j]) {i++;j++;}
			else {
				if(a[i]>b[j]) j++;
				else {System.out.println("Day a[] khong phai la day con cua day b[]");break;}
			}
			if(i==m)System.out.println("Day a[] la day con cua day b[]");
			if(j==n&&i!=m)System.out.println("Day a[] khong phai la day con cua day b[]");
		}else System.out.println("Day a[] khong phai la day con cua day b[]");
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
	public static void sort(int A[]) {
		for(int i=0;i<A.length-1;i++) 
		for(int j=i+1;j<A.length;j++)
		if(A[j]<A[i]) { int t=A[i]; A[i]=A[j]; A[j]=t;}
	}}
