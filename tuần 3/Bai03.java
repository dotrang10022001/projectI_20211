package tuan3;
import java.util.Scanner;
public class Bai03 {
	public static void main(String[] args) {
		int n,min;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		min=A[0];
		for(int i=1;i<n;i++) if(A[i]<min) min=A[i];
		System.out.println("So nho nhat trong day la: " + min);
		System.out.println("Cac chi so ung voi gia tri "
		+min+" trong day la:");
		for(int i=0;i<n;i++)
		if(A[i]==min) System.out.print(i + " ");
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
