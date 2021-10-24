package tuan2;
import java.util.Scanner;
public class Bai04_ham_thutuc {
	public static void main(String[] args) {
		int N;
		System.out.print("Nhap so tu nhien N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		System.out.print("So Fibonaxi thu " + N + " la: " + fibonaxi(N));
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
    public static int fibonaxi(int n) {
    	if(n==1||n==2)return 1;
    	return fibonaxi(n-1)+fibonaxi(n-2);
    }
}
