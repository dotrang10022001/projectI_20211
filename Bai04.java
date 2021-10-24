package tuan3;
import java.util.Scanner;
public class Bai04 {
	public static void main(String[] args) {
		int n,max;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		max=A[0];
		for(int i=1;i<n;i++) if(A[i]>max) max=A[i];
		System.out.println("So lon nhat trong day la: " + max);
		System.out.println("Cac chi so ung voi gia tri "+max+
				" trong day la: ");
		for(int i=0;i<n;i++)
		if(A[i]==max) System.out.print(i + " ");
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
