package tuan3;
import java.util.Scanner;
public class Bai01 {
	public static void main(String[] args) {
		int n,t;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++)
		for(int j=i+1;j<n;j++) {
			if(A[j]>A[i]) {
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		System.out.println("Day sau khi sap xep giam dan la:");
		for(int i=0;i<n;i++) System.out.print(A[i] + " ");
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
