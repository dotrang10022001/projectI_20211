package tuan3;
import java.util.Scanner;
public class Bai08 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so nguyen) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		if(A[i]==0) {xoa(A,i);i--;n--;}
		System.out.println("Day sau khi xoa cac phan tu 0 la:");
		for(int i=0;i<n;i++) System.out.print(A[i] + " ");
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
    public static void xoa(int a[],int vitrixoa) {
    	for(int i=vitrixoa;i<a.length-1;i++) a[i]=a[i+1];
    }
}
