package tuan2;
import java.util.Scanner;
public class Bai09 {
	public static void main(String[] args) {
		int N;
		System.out.print("Nhap so tu nhien N(>1): ");
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		sc.close();
		System.out.print(N + "=");
		for(int i=2;i<=N;i++) {
			if(N%i==0) {
				N = N/i;
				System.out.print(i);
				if(N!=1)System.out.print("x");
				i--;
			}
		}
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
