package tuan3;
import java.util.Scanner;
public class Bai06 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		System.out.println("Cac cap so trong day thoa man "
				+ "\nso nay la uoc so thuc su cua so kia la: ");
		for(int i=0;i<n-1;i++)
		for(int j=i+1;j<n;j++)
		if(A[i]%A[j]==0||A[j]%A[i]==0&&A[i]!=A[j])
			System.out.println(A[i] + " " + A[j]);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
