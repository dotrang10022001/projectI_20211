package tuan3;
import java.util.Scanner;
public class Bai02 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so tu nhien) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		System.out.println("Cac so nguyen to co trong day la:");
		for(int i=0;i<n;i++)
		if(isPrime(A[i])) System.out.print(A[i] + " ");
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
    public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i=2;i<n;i++) if(n%i==0)return false;
    	return true;
    }
}
