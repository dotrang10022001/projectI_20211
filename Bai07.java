package tuan3;
import java.util.Scanner;
public class Bai07 {
	public static void main(String[] args) {
		int n,t,flag=0;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++)
		for(int j=i+1;j<n;j++) 
		if(A[j]<A[i]) {t = A[i];A[i] = A[j];A[j] = t;}
		System.out.println("So nho nhat trong day "
				+ "\nma khong bang bat cu so nao la: ");
		if(A[0]<A[1]) {System.out.println(A[0]);flag=1;}
		else {
			for(int i=1;i<n-1;i++)
			if(A[i]>A[i-1]&&A[i]<A[i+1]) {
				System.out.println(A[i]);
				flag=1;
				break;
			}}
		if(flag==0)System.out.println(A[n-1]);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
