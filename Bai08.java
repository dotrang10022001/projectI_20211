package tuan2;
import java.util.Scanner;
public class Bai08 {
	public static void main(String[] args) {
		int N;
		System.out.print("Nhap so tu nhien N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		for(int i=2;i<=N;i++)
		if(N%i==0) {
			if(isPrime(i)) {
				System.out.println("Uoc so nguyen to nho nhat cua "+N+" la: "+i);
				break;
			}
		}
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
	public static boolean isPrime(int n) {
		if(n<2)return false;
    	for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
